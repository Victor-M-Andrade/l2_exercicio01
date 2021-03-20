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

			System.out.println("Número do voto: " + voto);
		}

		System.out.println("Fim da Aplicação");

	}

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "João Gumercino");
		mapaDeCandidatos.put(joao.getId(), joao);

		Candidato maria = new Candidato(2, "Maria Madalena");
		mapaDeCandidatos.put(maria.getId(), maria);

		Candidato jose = new Candidato(3, "José Jounes");
		mapaDeCandidatos.put(jose.getId(), jose);

		Candidato antonio = new Candidato(4, "Antônio Maomé");
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

			System.out.println("Valor inválido");
			return -1;
		}

	}

	private void registrarVoto(int voto) {
		/*
		 * NOME_MAPA.containsKey(CHAVE_EM_QUESTAO) NOME_MAPA.get(CHAVE_EM_QUESTAO)
		 * não faço a minima ideia de como fazer
		 */

	}
}
