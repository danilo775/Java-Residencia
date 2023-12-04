package transporteViario;
import java.util.Date;
import java.util.List;

public class SistemaTransporte {
    
        // Exemplo de utilização dos métodos
      

    public void cadastrarVeiculo(String placa, String modelo) {
        // Implementação do cadastro de veículos
    }

    public void cadastrarMotorista(String nome, String cpf) {
        // Implementação do cadastro de motoristas
    }

    public void cadastrarCobrador(String nome, String cpf) {
        // Implementação do cadastro de cobradores
    }

    public void cadastrarPassageiro(String nome, String tipoCartao) {
        // Implementação do cadastro de passageiros
    }

    public void cadastrarPontoDeParada(String nome) {
        // Implementação do cadastro de pontos de parada
    }

    public void cadastrarTrajeto(List<Trecho> trechos) {
        // Implementação do cadastro de trajetos
    }

    public void cadastrarTrecho(PontoDeParada origem, PontoDeParada destino, int intervaloEstimadoMinutos) {
        // Implementação do cadastro de trechos
    }

   
    public void registrarJornada(Motorista motorista, Cobrador cobrador, Veiculo veiculo, Date inicio, Date fim, List<Trajeto> trajetos) {
        // Implementação do registro de jornadas
    }

   
    public void registrarInicioTrajeto(Jornada jornada, Trajeto trajeto, Date dataHoraInicio) {
        // Implementação do registro de início de trajeto
    }

   
    public void registrarEmbarqueComCartao(Passageiro passageiro, PontoDeParada pontoEmbarque, String cartao) {
        // Implementação do registro de embarque com cartão
    }

   
    public void registrarCheckpoint(Trajeto trajeto, PontoDeParada ponto, Date horario) {
        // Implementação do registro de checkpoint
    }
}
