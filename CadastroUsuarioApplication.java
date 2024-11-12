import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/usuarios")
public class CadastroUsuarioApplication {

    private List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(CadastroUsuarioApplication.class, args);
    }

    @PostMapping
    public String cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return "Usuário cadastrado com sucesso!";
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}

class Usuario {
    private String nome;
    private String email;

   
}

//**Java é uma linguagem consolidada e amplamente utilizada em diversas aplicações. Conhecê-la pode ser útil em cenários como:
//Desenvolvimento de Aplicações Web: Java é frequentemente usado para criar aplicações robustas e escaláveis.
//Sistemas Corporativos: Muitas empresas utilizam Java para desenvolver sistemas internos devido à sua segurança e confiabilidade.
//Big Data e Inteligência Artificial: Java é utilizado em frameworks como Apache Hadoop, tornando-se essencial para o processamento de grandes volumes de dados