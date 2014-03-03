package com.lugtech.bukkitautogen.yaml;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Yaml {
	
	private final YamlNode rootNode;
	
	static boolean log = false;
	
	public Yaml() {
		rootNode = new YamlNode(0);
	}
	public Yaml(final InputStream input) {
		rootNode = new YamlNode(0, new Scanner(input));
	}
	
	public YamlNode getRootNode() {
		return rootNode;
	}
	
	public void save(PrintStream output) {
		PrintStream writer = new PrintStream(output);
		writer.print("# THIS FILE IS AUTOMATICALLY GENERATED. ANY CHANGES WILL BE OVERWRITTEN");
		rootNode.write(writer);
		writer.close();
	}
	
	public static void log(boolean log) {
		Yaml.log = log;
	}
}