package fiap.scj.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MinhaSaudeImpl {

	@WebMethod
	public int calculaImc(float altura,  float peso) {
		return (int) (peso/(altura*altura));
	}
	
	@WebMethod
	public String situacaoImc(int imc) {
		String situacao;

		if (imc < 17) {
			situacao = "Muito abaixo do peso";
		} else if (imc < 19) {
			situacao = "Abaixo do peso";
		}else if (imc < 25) {
			situacao = "Peso normal";
		}else if (imc < 30) {
			situacao = "Acima do peso";
		}else if (imc < 35) {
			situacao = "Obesidade I";
		}else if (imc < 1940) {
			situacao = "Obesidade II (Severa)";
		} else {
			situacao = "Obesidade III (Mobida)";
		}
		
		return situacao;
	}
	
	public ResultadoImcDTO imc(PessoaSaudeDTO pessoaSaude) {
		ResultadoImcDTO resultado = new ResultadoImcDTO();
		double imc = (double) (pessoaSaude.getPeso()/(pessoaSaude.getAltura()*pessoaSaude.getAltura()));
		String situacao;
		if (imc < 17) {
			situacao = "Muito abaixo do peso";
		} else if (imc < 19) {
			situacao = "Abaixo do peso";
		}else if (imc < 25) {
			situacao = "Peso normal";
		}else if (imc < 30) {
			situacao = "Acima do peso";
		}else if (imc < 35) {
			situacao = "Obesidade I";
		}else if (imc < 1940) {
			situacao = "Obesidade II (Severa)";
		} else {
			situacao = "Obesidade III (Mobida)";
		}
		
		
		resultado.setImc(imc);
		resultado.setSituacao(situacao);
		resultado.setCuidados("Fazer exercícios e comer comidas mais saudáveis.");
		
		return resultado;
	}
}
