package org.example;

import org.example.adapters.external.gitlab.GitLabClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

@SpringBootApplication
@EnableFeignClients
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	private GitLabClient gitLabClient;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) {
		HelloCommand helloCommand = new HelloCommand();
		CommandProcessor commandProcessor = new CommandProcessor(helloCommand);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Entrez une commande : ");
			String input = scanner.nextLine().trim();

			if (input.equals("exit")) {
				break;
			}

			commandProcessor.executeCommand(input);
		}
	}

}