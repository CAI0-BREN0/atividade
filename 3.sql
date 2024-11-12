CREATE TABLE log_api_cep (
    log_id INT PRIMARY KEY IDENTITY(1,1),
    log_cep VARCHAR(10),
    log_resposta VARCHAR(500),
    log_data DATETIME DEFAULT GETDATE()
);

--SQL (Structured Query Language) é fundamental para gerenciar e manipular bancos de dados relacionais. A importância do conhecimento em SQL se dá por:
--Acesso a Dados: Permite que profissionais acessem, atualizem e gerenciem grandes volumes de dados de forma eficiente.
--Análise de Dados: Habilidades em SQL são essenciais para analistas e cientistas de dados, pois muitos relatórios e análises dependem da extração precisa de informações
Análise de Dados: Habilidades em SQL são essenciais para analistas e cientistas de dados, pois muitos relatórios e análises dependem da extração precisa de informações4.
Acesso a Dados: Permite que profissionais acessem, atualizem e gerenciem grandes volumes de dados de forma eficiente.
Análise de Dados: Habilidades em SQL são essenciais para analistas e cientistas de dados, pois muitos relatórios e análises dependem da extração precisa de informações4.
INSERT INTO log_api_cep (log_cep, log_resposta)
VALUES ('01531-001', '{"logradouro": "Avenida da Aclimação", "bairro": "Aclimação", "localidade": "São Paulo", "uf": "SP"}');