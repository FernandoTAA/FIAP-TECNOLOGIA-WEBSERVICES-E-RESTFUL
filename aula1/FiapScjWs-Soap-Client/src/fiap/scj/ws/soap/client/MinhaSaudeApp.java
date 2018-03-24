package fiap.scj.ws.soap.client;

public class MinhaSaudeApp {

	public static void main(String[] args) {
		MinhaSaudeImpl servico = new MinhaSaudeImplService().getMinhaSaudeImplPort();
		int imc = servico.calculaImc(1.80F, 77.5F);
		System.out.println("Meu IMC é: " + imc);

		String situacao = servico.situacaoImc(imc);
		System.out.println("Sua situação é: " + situacao);
		
		PessoaSaudeDTO pessoaSaude = new PessoaSaudeDTO();
		pessoaSaude.setNome("Fernando Teixeira");
		pessoaSaude.setIdade((byte) 29);
		pessoaSaude.setAltura(1.80F);
		pessoaSaude.setPeso(77.5F);
		
		ResultadoImcDTO resultado = servico.imc(pessoaSaude);
		
		System.out.println("IMC: " + resultado.getImc());
		System.out.println("Situacao: " + resultado.getSituacao());
		System.out.println("Cuidados: " + resultado.getCuidados());
	}

}
