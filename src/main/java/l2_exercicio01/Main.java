package l2_exercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

			registrarVoto(voto);
		}

		apurarVotos();

		System.out.println("Fim da Aplicação");

	}

	private void apurarVotos() {
        // TODO Auto-generated method stub

        List<Candidato> candidatos = new ArrayList<Candidato>();

        for (Candidato candidato : mapaDeCandidatos.values()) {

            candidatos.add(candidato);

        }

        candidatos.sort((a, b) -> {
            return b.getNumeroDeVotos() - a.getNumeroDeVotos();
        });
        
        /**
         * Neste trecho faremos a etapa na qual sera identificado quantos candidatos estao empatados
         */
        List<Candidato> candidatosEmpatados = new ArrayList<Candidato>();
        for (Candidato candidato : candidatosEmpatados) {
			/*
			 * vejam que a primeira posição da lista ja eh o candidato 
			 * com o maior numero de votos... portanto basta criar uma mini logica
			 * na qual checa os votos dos demais candidatos
			 */
		}
        
        
        
        /**
         * Esse bloco exibe o candidato eleito e a posição do restante
         */
        
        Candidato candidatoEleito = candidatos.get(0);

        System.out.println("O candidato eleito é o " + candidatoEleito.getNome() + " com " + candidatoEleito.getNumeroDeVotos() + " votos!");

        for(int i = 0; i< candidatos.size(); i++) {

            Candidato candidato = candidatos.get(i);
            System.out.println(i+1 + "° Lugar candidato " + candidato.getNome() + " - " + candidato.getNumeroDeVotos());

        }

    }

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "João Gumercino");
		Candidato maria = new Candidato(2, "Maria Madalena");
		Candidato jose = new Candidato(3, "José Jounes");
		Candidato antonio = new Candidato(4, "Antônio Maomé");
		Candidato tibursinho = new Candidato(5, "Tibursinho VidaLoka");

		mapaDeCandidatos.put(joao.getId(), joao);
		mapaDeCandidatos.put(maria.getId(), maria);
		mapaDeCandidatos.put(jose.getId(), jose);
		mapaDeCandidatos.put(antonio.getId(), antonio);
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
		 */

		if (mapaDeCandidatos.containsKey(voto)) {

			Candidato candidato = mapaDeCandidatos.get(voto);
			candidato.adicionarVoto();

			System.out.println("Nome do candidato votado: " + candidato.getNome() + ".");
			System.out.println("Obrigado pelo voto seu candango!");

		} else {
			System.out.println("Desculpa esse candidato não existe. Tente novamente");
		}

	}
}
