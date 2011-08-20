package com.arrggh.generator.npc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class RaceParser {
	@SuppressWarnings("unchecked")
	public Map<String, Race> loadRaces() {
		Map<String, Race> results = new HashMap<String, Race>();
		try {
			SAXBuilder reader = new SAXBuilder();
			Document doc = reader.build(new File("data/shadowrun-races.xml"));
			Element rootElement = doc.getRootElement();
			String systemName = rootElement.getAttributeValue("system");
			List<Element> eRace = rootElement.getChildren("race");
			for (Element node : eRace) {
				System.out.println(node);
				String raceName = node.getAttributeValue("name");
				String raceWeight = node.getAttributeValue("weigth");
				String raceHeight = node.getAttributeValue("heigth");
				
				Race race = new Race(systemName, raceName, Double.valueOf(raceWeight), Double.valueOf(raceHeight));
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}

	public static void main(String[] args) {
		new RaceParser().loadRaces();
	}
}
