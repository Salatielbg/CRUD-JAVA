-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.35 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para trabalho_crud
CREATE DATABASE IF NOT EXISTS `trabalho_crud` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `trabalho_crud`;

-- Copiando estrutura para tabela trabalho_crud.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `datanascimento` date DEFAULT NULL,
  `cpf` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `n_telefone` varchar(15) DEFAULT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `complemento` varchar(100) DEFAULT NULL,
  `cep` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela trabalho_crud.clientes: ~2 rows (aproximadamente)
INSERT INTO `clientes` (`id_cliente`, `nome`, `datanascimento`, `cpf`, `n_telefone`, `rua`, `complemento`, `cep`, `numero`) VALUES
	(13, 'henrique', '2024-06-10', '056.065.043-11', '(66) 99999-9999', 'ddaddf', 'sddasfdsafsfasf', '78550-001', '1321'),
	(14, 'sdcsdcs', '2024-06-10', '106.501.650-10', '(50) 15610-5601', 'xxxxx', 'zzxddd', '12121-444', '12');

-- Copiando estrutura para tabela trabalho_crud.quartos
CREATE TABLE IF NOT EXISTS `quartos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `preco_diaria` decimal(10,2) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numero` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela trabalho_crud.quartos: ~3 rows (aproximadamente)
INSERT INTO `quartos` (`id`, `numero`, `tipo`, `preco_diaria`, `status`) VALUES
	(1, 101, 'Simples', 150.00, 'disponível'),
	(2, 102, 'Duplo', 200.00, 'disponível'),
	(3, 201, 'Suíte', 300.00, 'disponível');

-- Copiando estrutura para tabela trabalho_crud.reservas
CREATE TABLE IF NOT EXISTS `reservas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `nome` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `id_quarto` int NOT NULL,
  `data_checkin` date NOT NULL,
  `data_checkout` date NOT NULL,
  `status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_quarto` (`id_quarto`),
  KEY `id_cliente` (`id_cliente`) USING BTREE,
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`id_quarto`) REFERENCES `quartos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela trabalho_crud.reservas: ~1 rows (aproximadamente)
INSERT INTO `reservas` (`id`, `id_cliente`, `nome`, `id_quarto`, `data_checkin`, `data_checkout`, `status`) VALUES
	(15, 14, 'sdcsdcs', 2, '2024-06-11', '2024-06-12', 'Finalizado');

-- Copiando estrutura para tabela trabalho_crud.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(45) DEFAULT NULL,
  `senha_usuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela trabalho_crud.usuario: ~3 rows (aproximadamente)
INSERT INTO `usuario` (`id_usuario`, `nome_usuario`, `senha_usuario`) VALUES
	(1, 'dvvvsvdv', 'sdsv'),
	(2, 'Henrique de Sa', '147852'),
	(3, 'Otavio', '123456');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
