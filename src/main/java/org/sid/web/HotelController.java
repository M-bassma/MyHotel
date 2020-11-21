package org.sid.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.sid.dao.UserRepository;
import org.sid.entities.Chambre;
import org.sid.entities.Hotel;
import org.sid.entities.Utilisateur;
import org.sid.metier.IGestionMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	@Autowired
	private IGestionMetier gestionMetier;
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	@Autowired 
	public UserRepository userRepository;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("home", "ok");
		return "index";
	}

	@RequestMapping(value = "/search")
	public String search(@RequestParam("ville") String ville, @RequestParam("debut") String debut,
			@RequestParam("fin") String fin, @RequestParam("number") Integer number, @RequestParam("type") String type,
			Model model) throws ParseException {
		/***** l'initialisation des variables **********/
		List<Hotel> listHotel = null;
		/***********************/

		/*** remplissage de la liste des hotels selon les critères ****/
		if (debut.equals("") && fin.equals("") && number == 0 && type.equals("") && !(ville.equals(null))) {
			listHotel = gestionMetier.listHotelVille(ville);
		} else {
			if (!(debut.equals("")) && !(fin.equals("")) && number == 0 && type.equals("") && !(ville.equals(null))) {
				listHotel = gestionMetier.listHotelVP(ville, simpleDateFormat.parse(debut),
						simpleDateFormat.parse(fin));
				model.addAttribute("debut", debut);
				model.addAttribute("fin", fin);
			} else {
				if (!(debut.equals("")) && !(fin.equals("")) && number != 0 && !(type.equals(""))
						&& !(ville.equals(null))) {
					listHotel = gestionMetier.listHotelVPR(ville, simpleDateFormat.parse(debut),
							simpleDateFormat.parse(fin), number, type);
					model.addAttribute("type", type);
					model.addAttribute("debut", debut);
					model.addAttribute("fin", fin);
				} else {
					listHotel = null;
				}

			}

		}
		/***********************************/
		if (listHotel != null) {
			model.addAttribute("listHotelVille", listHotel);
			model.addAttribute("ville", ville);
			model.addAttribute("temp", type);
			model.addAttribute("number", number);
		}
		return "rooms";
	}

	@RequestMapping(value = "/contact")
	public String contact(Model model) {
		model.addAttribute("contact", "ok");
		model.addAttribute("message", null);
		return "contact";
	}

	@RequestMapping("/sendContactForm")
	public String sendContactForm(HttpServletRequest request,Model model) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String libelle= request.getParameter("hotel");
		String message = "";
		if (name != null && email != null && libelle != null) {
			Integer duration = Integer.parseInt(request.getParameter("duration"));
			Hotel hotel = gestionMetier.get(libelle);
			Utilisateur user = new Utilisateur(name, email, hotel, duration);
			userRepository.save(user);
			message = "You will receive a message as soon as it's possible";
		}
		model.addAttribute("message", message);
		return "contact";
	}

	@RequestMapping(value = "/about")
	public String about(Model model) {
		List<Hotel> listHotel = gestionMetier.listHotel();
		Integer prix = Integer.MAX_VALUE;
		for (Hotel hotel : listHotel) {
			for (Chambre chambre : hotel.getChambres()) {
				if (prix > chambre.getPrix())
					prix = chambre.getPrix();
			}
		}
		model.addAttribute("prix", prix);
		model.addAttribute("count", listHotel.size());
		model.addAttribute("about", "ok");
		return "about-us";
	}
}
