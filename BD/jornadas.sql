-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 25, 2023 at 12:34 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jornadas`
--

-- --------------------------------------------------------

--
-- Table structure for table `areaestudo`
--

CREATE TABLE `areaestudo` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `area_aluno`
--

CREATE TABLE `area_aluno` (
  `idAreaEstudo` int NOT NULL,
  `idAluno` int NOT NULL,
  `pontuacao` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`id`, `nome`) VALUES
(1, 'Agricultura'),
(2, 'Artes e Humanidades'),
(3, 'Ciências'),
(4, 'Ciências Sociais, Comércio e Direito'),
(5, 'Educação'),
(6, 'Engenharias, Indústria e Construção'),
(7, 'Saúde e Proteção Social'),
(8, 'Serviços');

-- --------------------------------------------------------

--
-- Table structure for table `concelho`
--

CREATE TABLE `concelho` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `distrito_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `concelho`
--

INSERT INTO `concelho` (`id`, `nome`, `distrito_id`) VALUES
(1, 'Porto', 1);

-- --------------------------------------------------------

--
-- Table structure for table `distrito`
--

CREATE TABLE `distrito` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `distrito`
--

INSERT INTO `distrito` (`id`, `nome`) VALUES
(1, 'Porto');

-- --------------------------------------------------------

--
-- Table structure for table `freguesia`
--

CREATE TABLE `freguesia` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `concelho_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `freguesia`
--

INSERT INTO `freguesia` (`id`, `nome`, `concelho_id`) VALUES
(1, 'Porto', 1);

-- --------------------------------------------------------

--
-- Table structure for table `instituicao`
--

CREATE TABLE `instituicao` (
  `id` int NOT NULL,
  `nome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `tipo` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int UNSIGNED NOT NULL,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2019_12_14_000001_create_personal_access_tokens_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pergunta`
--

CREATE TABLE `pergunta` (
  `id` int NOT NULL,
  `questao` text COLLATE utf8mb4_general_ci NOT NULL,
  `categoria_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pergunta`
--

INSERT INTO `pergunta` (`id`, `questao`, `categoria_id`) VALUES
(1, 'Gostaria de trabalhar na produção agrícola (recolha de ovos, ordenha de animais, alimentação de gado)', 1),
(2, 'Gosto de criar e cuidar de animais', 1),
(3, 'Conseguia imaginar-me a passar o dia a cuidar de árvores, flores e legumes', 1),
(4, 'Interesso-me por monitorizar a saúde e o crescimento de animais e plantas', 1),
(5, 'Gostaria de aprender como as plantações crescem e prosperam', 1),
(6, 'Imaginava-me no cultivo de cereais ou árvores de fruto', 1),
(7, 'Gostaria de trabalhar em agricultura', 1),
(8, 'Gosto de trabalhar ao ar livre', 1),
(9, 'Gosto de estar na natureza independentemente das condições atmosféricas', 1),
(10, 'Gosto de trabalhar com plantas ou animais', 1),
(11, 'Interesso-me por usar de forma consciente os recursos naturais da terra', 1),
(12, 'Gostaria de cuidar de plantas e flores e vendê-las ao público', 1),
(13, 'Gostaria de documentar eventos através de imagens', 2),
(14, 'Sentiria orgulho por ilustrar livros ou apresentar o meu trabalho numa galeria', 2),
(15, 'Imaginava-me a criar adereços, joalharia ou outros trabalhos manuais', 2),
(16, 'Gostaria de dedicar o meu tempo a ensaiar para atuar em público', 2),
(17, 'Gostaria de passar os meus dias a imaginar e criar obras de arte', 2),
(18, 'Interesso-me por edição de imagem (retocar, editar, efeitos)', 2),
(19, 'Imagino-me a trabalhar com artes ou a ser intérprete (música, dança, teatro e cinema)', 2),
(20, 'Imagino-me a escrever artigos para revistas ou jornais', 2),
(21, 'Preciso que a minha profissão futura implique criatividade', 2),
(22, 'Gostaria de ter um local e horário de trabalho flexíveis', 2),
(23, 'Gostaria de escrever um livro', 2),
(24, 'Adoraria estar perante um público', 2),
(25, 'Tenho curiosidade em estudar o efeito de substâncias no corpo humano (e.g., vitaminas, medicação)', 3),
(26, 'Gostaria de criar projetos ligados à tecnologia (ex. autocarros elétricos, estações espaciais...)', 3),
(27, 'Interesso-me por aprender como cuidar de pessoas doentes', 3),
(28, 'Interesso-me por estudar o mundo natural e analisar rochas e fósseis', 3),
(29, 'Gostaria de perceber o efeito de produtos químicos em colheitas ou seres vivos', 3),
(30, 'Imagino-me a criar projetos para novos eletrodomésticos ou veículos', 3),
(31, 'Imagino-me a criar projetos para edifícios', 3),
(32, 'Gosto de perceber como é que as coisas funcionam', 3),
(33, 'Gosto de procurar novas maneiras de resolver os problemas', 3),
(34, 'Imagino-me a trabalhar com sistemas informáticos, inteligência artificial e robôs', 3),
(35, 'Quero descobrir como resolver problemas usando a ciência', 3),
(36, 'Gostaria de aprender mais sobre marés, vento e pressão atmosférica', 3),
(37, 'Gostaria de elaborar planos econômicos e financeiros para empresas', 4),
(38, 'Imagino-me a aconselhar clientes sobre como tomar decisões legais', 4),
(39, 'Gostaria de elaborar pareceres jurídicos', 4),
(40, 'Gostaria de escrever a história de vida de pessoas famosas ou importantes', 4),
(41, 'Gostaria de recolher e escrever histórias para as notícias', 4),
(42, 'Imagino-me a informar clientes dos riscos de investimento e calcular os prêmios das apólices de seguro', 4),
(43, 'Consigo persuadir os outros a concordarem comigo, conseguiria persuadir pessoas a comprarem o que eu aconselhasse', 4),
(44, 'Gostaria de aconselhar gestores na política econômica das suas empresas', 4),
(45, 'Gostaria de vender casas ou apartamentos e ajudar clientes a escolherem a melhor opção', 4),
(46, 'Gosto de conhecer diferentes tipos de pessoas', 4),
(47, 'Consigo imaginar-me a apresentar um telejornal ou conduzir uma entrevista', 4),
(48, 'Gostaria de produzir e analisar estatísticas', 4),
(49, 'Gosto de ensinar aos outros como fazer algo', 5),
(50, 'Teria interesse em orientar atividades recreativas para pessoas com incapacidade', 5),
(51, 'Sou competente em planear e dirigir atividades para os outros', 5),
(52, 'Interesso-me por aprender mais e partilhar o meu conhecimento', 5),
(53, 'Gostaria de planear um curso destinado a jovens', 5),
(54, 'Consigo imaginar-me a ensinar artes, música ou teatro', 5),
(55, 'Gosto de tomar conta de crianças', 5),
(56, 'Gosto de dar conselhos aos outros', 5),
(57, 'Gosto de ajudar os outros a superar desafios', 5),
(58, 'Sou bom a comunicar com diferentes tipos de pessoas', 5),
(59, 'Sou competente em assumir várias responsabilidades ao mesmo tempo', 5),
(60, 'Gosto de estar sempre a aprender e a inovar', 5),
(61, 'Imagino os meus dias ligados à construção de edifícios', 6),
(62, 'Imagino-me a manusear ferramentas para produzir peças ou acabamentos em madeira', 6),
(63, 'Gostaria de fazer a revisão e reparar avarias de vários tipos de veículos', 6),
(64, 'Gostaria de trabalhar com o restauro de móveis ou como estufador', 6),
(65, 'Gostaria de reparar avarias em pequenos e grandes eletrodomésticos', 6),
(66, 'Gostaria de passar os meus dias a usar ferramentas e utensílios usados em reparações', 6),
(67, 'Gostaria de passar os meus dias a instalar e reparar canalizações', 6),
(68, 'Gostaria de trabalhar com máquinas de costura e tricot', 6),
(69, 'Gostaria de perceber como funcionam os sistemas elétricos', 6),
(70, 'Gostaria de orientar e supervisionar a construção de um edifício, estrada ou ponte', 6),
(71, 'Imagino-me a cortar tecidos para criar peças de vestuário ou artigos para o lar', 6),
(72, 'Imagino os meus dias a conduzir maquinaria pesada (ex. escavadora)', 6),
(73, 'Imagino-me a conhecer e aplicar regras de saúde pública', 7),
(74, 'Gostaria de ajudar a prevenir e combater o consumo de drogas', 7),
(75, 'Gostaria de ajudar um dentista na preparação do tratamento de um dente', 7),
(76, 'Gostaria de tomar conta de pessoas idosas', 7),
(77, 'Gostaria de ajudar pessoas na tomada de decisão e resolução dos seus problemas pessoais', 7),
(78, 'Imagino os meus dias a ouvir os problemas de outras pessoas', 7),
(79, 'Gostaria de prestar cuidados básicos do dia-a-dia a pessoas que precisam de apoio', 7),
(80, 'Gostaria de participar em experiências científicas', 7),
(81, 'Gostaria de influenciar as pessoas na escolha de uma vida ativa e saudável', 7),
(82, 'Gostaria de tomar conta de pessoas doentes', 7),
(83, 'Gostaria de fazer análises clínicas a pacientes', 7),
(84, 'Consigo imaginar os meus dias a trabalhar num laboratório', 7),
(85, 'Imagino os meus dias a cortar e pentear cabelos', 8),
(86, 'Gostaria de transportar pessoas', 8),
(87, 'Gostaria de trabalhar em atendimento ao público', 8),
(88, 'Gostaria de passar os meus dias a fazer trabalhos de costura', 8),
(89, 'Gostaria de ajudar pessoas no planeamento de viagens e férias', 8),
(90, 'Consigo imaginar os meus dias a atender telefonemas, receber mensagens e encomendas', 8),
(91, 'Gostaria de prestar apoio a pessoas com algum tipo de incapacidade', 8),
(92, 'Gosto de preparar alimentos e cozinhar', 8),
(93, 'Gostaria de arquivar livros e documentos', 8),
(94, 'Ficaria feliz por organizar e planear atividades de tempos livres para crianças, jovens e adultos', 8),
(95, 'Gostaria de consertar sapatos', 8),
(96, 'Imagino-me a guiar e orientar pessoas em visitas turísticas', 8);

-- --------------------------------------------------------

--
-- Table structure for table `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tokenable_id` bigint UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
  `abilities` text COLLATE utf8mb4_unicode_ci,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `primeiroNome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `ultimoNome` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `genero` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `freguesia_id` int NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `primeiroNome`, `ultimoNome`, `genero`, `freguesia_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(7, 'email1@email.com', '$2y$10$vt1jraLTH9hsIm2rJzum4u8IBtAQ.7rFcr/S4NtY9/xcjuXVHthsO', 'Diana', 'Silva', 'Feminino', 1, '2023-10-10 23:40:52', NULL, NULL),
(8, 'email2@email.com', '$2y$10$R.NB4DrAtLaiNe4YOYn5sOMG8P6UqTAYdJGJgbkRLaOaYY.w3xiEy', 'Pedro', 'Castro', 'Masculino', 1, '2023-10-10 23:40:52', NULL, NULL),
(9, 'email3@email.com', '$2y$10$efvChNS7lzY3ytl8d6lIhOFgu4fPHTpTzO7AZRG4aKwJ2OeNmFYKC', 'Bruna', 'Silva', 'Feminino', 1, '2023-10-10 23:40:52', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `areaestudo`
--
ALTER TABLE `areaestudo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `area_aluno`
--
ALTER TABLE `area_aluno`
  ADD PRIMARY KEY (`idAreaEstudo`,`idAluno`),
  ADD KEY `idAluno` (`idAluno`);

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `concelho`
--
ALTER TABLE `concelho`
  ADD PRIMARY KEY (`id`),
  ADD KEY `distrito_id` (`distrito_id`);

--
-- Indexes for table `distrito`
--
ALTER TABLE `distrito`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `freguesia`
--
ALTER TABLE `freguesia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `concelho_id` (`concelho_id`);

--
-- Indexes for table `instituicao`
--
ALTER TABLE `instituicao`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pergunta`
--
ALTER TABLE `pergunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoria_id` (`categoria_id`);

--
-- Indexes for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `freguesia_id` (`freguesia_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `areaestudo`
--
ALTER TABLE `areaestudo`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `concelho`
--
ALTER TABLE `concelho`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `distrito`
--
ALTER TABLE `distrito`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `freguesia`
--
ALTER TABLE `freguesia`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `instituicao`
--
ALTER TABLE `instituicao`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pergunta`
--
ALTER TABLE `pergunta`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `area_aluno`
--
ALTER TABLE `area_aluno`
  ADD CONSTRAINT `area_aluno_ibfk_1` FOREIGN KEY (`idAreaEstudo`) REFERENCES `areaestudo` (`id`),
  ADD CONSTRAINT `area_aluno_ibfk_2` FOREIGN KEY (`idAluno`) REFERENCES `users` (`id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`freguesia_id`) REFERENCES `freguesia` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
