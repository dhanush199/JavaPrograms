package com.bridgelab.trails;
import java.io.*;

public class UnorderedList {
	public static void main(String[] args) throws IOException{
		String fileName="/home/admin1/Desktop/Example.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			char[] carr=line.toCharArray();
			System.out.println(sb.toString());
			//  return sb.toString();
		} finally {
			br.close();
		}
	}
}


