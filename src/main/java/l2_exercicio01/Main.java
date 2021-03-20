package l2_exercicio01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private Map<Integer, Candidato> mapaDeCandidatos = new HashMap<Integer, Candidato>();

	private void start() {
		inicializarMapaDeCandidatos();

		while (true) {

			int voto = obterVoto();
			if (voto == 0) {
				break;
			}

			System.out.println("N�mero do voto: " + voto);
		}

		System.out.println("Fim da Aplica��o");

	}

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "Jo�o Gumercino");
		mapaDeCandidatos.put(joao.getId(), joao);

		Candidato maria = new Candidato(2, "Maria Madalena");
		mapaDeCandidatos.put(maria.getId(), maria);

		Candidato jose = new Candidato(3, "Jos� Jounes");
		mapaDeCandidatos.put(jose.getId(), jose);

		Candidato antonio = new Candidato(4, "Ant�nio Maom�");
		mapaDeCandidatos.put(antonio.getId(), antonio);

		Candidato tibursinho = new Candidato(5, "Tibursinho VidaLoka");
		mapaDeCandidatos.put(tibursinho.getId(), tibursinho);

	}

	private int obterVoto() {

		System.out.println("Digite seu voto: ");
		Scanner scanner = new Scanner(System.in);

		try {

			return scanner.nextInt();
		} catch (Exception e) {

			scanner.next();

			System.out.println("Valor inv�lido");
			return -1;
		}

	}

	private void registrarVoto(int voto) {
		/*
		 * NOME_MAPA.containsKey(CHAVE_EM_QUESTAO) NOME_MAPA.get(CHAVE_EM_QUESTAO)
		 * n�o fa�o a minima ideia de como fazer
		 */

	}
}
