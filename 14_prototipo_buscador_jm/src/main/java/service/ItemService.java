package service;

import java.util.List;

import model.Item;

public class ItemService {

	static List<Item> items = (List.of(new Item("http://www.fnac.es/", "libros", "Libros y más"),
			new Item("http://www.mybook.com/", "libros", "librería de temas varios"),
			new Item("http://www.game.es/", "juegos", "Juegos variados"),
			new Item("http://www.music.es/", "música", "Lamejor música"),
			new Item("http://www.tech.com/", "libros", "Libros técnicos"),
			new Item("http://www.eljuego.es/", "juegos", "Juegos on-line")));

	public List<Item> buscarTema(String tema) {
		return items.stream().filter(p -> p.getTema().equals(tema)).toList();

	}

}
