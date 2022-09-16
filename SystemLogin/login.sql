--
-- DATABASE: SystemLogin
--
-- Estrutura da tabela `tb_login`
--

CREATE TABLE `tb_login` (
  `log_cod` int NOT NULL AUTO_INCREMENT,
  `log_user` varchar(30) NOT NULL,
  `log_pass` varchar(12) NOT NULL,
  PRIMARY KEY (`log_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select * from tb_login tl;