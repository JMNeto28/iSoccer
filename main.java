import java.util.Scanner;
public class Soccer {

			public static void main(String[] args) 
			{
				int controle = -1, controle2 = -1, quantosbus = 0, controle3 = -1,controle4 = -1, numFunc = 0, numSocio = 0, escolhaCt = 0,  escolherFuncio = 0,numDormi=0, numPreparadores = 0, numCozinheiros=0, quantosestadios = 0, numAdvogados = 0, numEspec=0, numBanheiros=0, numLanchonetes=0,  contadoradi =0,  contadorina = 0;
				String login, senha; 
				
				Scanner sc = new Scanner(System.in);
				String[][] tabela = new String[100][20]; // essa é dos funcionários
				String[][] socio = new String[100][20]; // dos sócios
				String[][] recursos = new String[100][20]; // dos recursos
				System.out.println("Por favor, insira:");
				System.out.println("Login:");
				login = sc.next();
				System.out.println("Senha:");
				senha = sc.next();
				
		while((login.equals("login")&& senha.equals("senha"))){
			while (escolherFuncio != 5)
			{
				System.out.println("Escolha a Funcionalidade: \n1- Adcionar funcionarios\n2- Socios\n3- Recursos Fisicos\n4- Relatorios\n5- Fechar programa");
				escolherFuncio = sc.nextInt();
				sc.nextLine();
				
				if(escolherFuncio == 1)
				{
				System.out.println("Escolha a função que irá ser adicionada:");
				System.out.println("1- Presidente\n2- Médico\n3- Tecnico\n4- Preparador Físico\n5- Motorista\n6- Cozinheiro\n7- Advogado\n8- Jogador");
				controle = sc.nextInt(); // para ler o caso do switch
				sc.nextLine(); // equivale ao getchar em C
				
			
				 switch(controle) 
				 {
				 case 1: // Adicionar presidente
					 tabela[numFunc][0] = "Presidente";
					 System.out.println("Nome do presidente:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email presidente:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do presidente:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do presidente: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira telefone do presidente: (EX: 8299998888)");
					 tabela[numFunc][5] = sc.nextLine();
					 numFunc++;
					 break;
					
				 case 2: // Adicionar médico
					 tabela[numFunc][0] = "Medico";
					 System.out.println("Nome do médico:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email médico:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do médico:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira CRM do médico:");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira salario do médico: (EX: 13000)");
					 tabela[numFunc][5] = sc.nextLine();
					 System.out.println("Insira telefone do médico: (EX: 8299998888)");
					 tabela[numFunc][6] = sc.nextLine();
					 numFunc++;
					 break;
					 
				 case 3: // Adicionar técnico 
					 tabela[numFunc][0] = "Tecnico";
					 System.out.println("Nome do técnico:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email técnico:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do técnico:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do técnico: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira telefone do técnico: (EX: 8299998888)");
					 tabela[numFunc][5] = sc.nextLine();
					 numFunc++;
					 break;
					
					 
				 case 4: //Preparador físico
					 System.out.println("Quantos preparadores são?\n");
					 numPreparadores = sc.nextInt();
					 sc.nextLine();
					 while(numPreparadores > 0)
					 {
						 tabela[numFunc][0] = "Preparador fisico";
					 System.out.println("Nome do Preparador físico:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email Preparador físico:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do Preparador físico:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do Preparador físico: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira telefone do Preparador físico: (EX: 8299998888)");
					 tabela[numFunc][5] = sc.nextLine();
					 numFunc++;
					 numPreparadores--;
					 }
					 break;
					 
				 case 5: // Motorista
					 tabela[numFunc][0] = "Motorista";
					 System.out.println("Nome do Motorista:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email Motorista:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do Motorista:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do Motorista: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira CNH do Motorista:\n");
					 tabela[numFunc][5] = sc.nextLine();
					 System.out.println("Insira telefone do Motorista: (EX: 8299998888)");
					 tabela[numFunc][6] = sc.nextLine();
					 numFunc++;
					 break;
					 
				 case 6: // Cozinheiros
					 System.out.println("Quantos cozinheiros são?\n");
					 numCozinheiros = sc.nextInt();
					 sc.nextLine();
					 while(numCozinheiros > 0)
					 {
						 tabela[numFunc][0] = "Cozinheiro";
					 System.out.println("Nome do Cozinheiros:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email Cozinheiros:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do Cozinheiros:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do Cozinheiros: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira telefone do Cozinheiros: (EX: 8299998888)");
					 tabela[numFunc][5] = sc.nextLine();
					 numFunc++;
					 numCozinheiros--;
					 }
					 break;
					 
				 case 7: // Advogados
					 System.out.println("Quantos Advogados são?");
					 numAdvogados = sc.nextInt();
					 sc.nextLine();
					 while(numAdvogados > 0)
					 {
						 tabela[numFunc][0] = "Advogado"; 
					 System.out.println("Nome do Advogado:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Insira email Advogado:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira CPF do Advogado:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira salario do Advogado: (EX: 13000)");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira telefone do Advogado: (EX: 8299998888)");
					 tabela[numFunc][5] = sc.nextLine();
					 numFunc++;
					 numAdvogados--;
					 }
					 break;
					 
				 case 8: // jogador
					 tabela[numFunc][0] = "Jogador";
					 System.out.println("Nome do Jogador:");
					 tabela[numFunc][1] = sc.nextLine();
					 System.out.println("Posição do Jogador:");
					 tabela[numFunc][2] = sc.nextLine();
					 System.out.println("Insira email Jogador:");
					 tabela[numFunc][3] = sc.nextLine();
					 System.out.println("Insira CPF do Jogador:");
					 tabela[numFunc][4] = sc.nextLine();
					 System.out.println("Insira salario do Jogador: (EX: 13000)");
					 tabela[numFunc][5] = sc.nextLine();
					 System.out.println("Insira telefone do Jogador: (EX: 8299998888)");
					 tabela[numFunc][6] = sc.nextLine();
					 System.out.println("O jogador está apto para jogar?:");
					 tabela[numFunc][7] = sc.nextLine();
					 numFunc++;
					 break;
					 
				 } // chaves do switchs
					 
				 } // chave do if adicionar funcionario (1)
				
				else if (escolherFuncio == 2) 
				{
					
					int con;
					

						 System.out.println("Nome do Socio:");
						 socio[numSocio][0] = sc.nextLine();
						 System.out.println("Insira email Socio:");
						 socio[numSocio][1] = sc.nextLine();
						 System.out.println("Insira CPF do Socio:");
						 socio[numSocio][2] = sc.nextLine();
						 System.out.println("Insira telefone do Socio: (EX: 8299998888)");
						 socio[numSocio][3] = sc.nextLine();
						 System.out.println("Insira endereço do socio:");
						 socio[numSocio][4] = sc.nextLine();
						 System.out.println("Insira valor de contribuição");
						 socio[numSocio][5] = sc.nextLine();
						 System.out.println("Sócio adimplente digite 1, ou se for inadimplente digite 2?");
						 {
							con = sc.nextInt(); // para ler o caso do switch
							sc.nextLine(); // equivale ao getchar em C
							 if(con == 1)
							 {
								 contadoradi++;
							 }
							 else {
								 contadorina++;
							 }
						 }
						 numSocio++;
						
					 
				} // chaves do else if socio torcedor (2)
				
				else if (escolherFuncio == 3)
				{
					System.out.println("1- Onibus\n2- Estádio\n3- CT");
					controle3 = sc.nextInt(); // para ler o ca so do switch
					sc.nextLine(); // equivale ao getchar em C
					int verificar = 0, verificar2 = 0, verificar3 = 0, verificar4 = 0, verificar5=0;
					
					 switch(controle3)
					 {
					 case 1: //Busão
						 System.out.println("1- Adcionar/verificar onibus\n2- Verificar disponibilidade");
						 verificar = sc.nextInt();
						 sc.nextLine();
						 if (verificar == 1)
						 {
							 System.out.println("1- Adicionar\n2- Verificar");
							 verificar2 = sc.nextInt();
							 sc.nextLine();
							 if(verificar2 == 1)
							 {
								 quantosbus++;
								 System.out.println("Adicionou um onibus ao clube!");
							 }
							 if(verificar2 == 2)
							 {
								 System.out.printf("Onibus do clube: %d\n", quantosbus);
							 }
						 }
						 else
						 {
							 if(quantosbus >= 1)
							 {
								 System.out.printf("O Clube tem disponibilidade de %d onibus\n", quantosbus);
							 }
							 else
							 {
								 System.out.println("Não temos disponibilidade de onibus!");
							 }
						 }
						 break;
						 
					 case 2: // estádio
						 System.out.println("1- Adicionar/buscar o estádio\n2- Verificar disponibilidade\n3- Capacidades/Banheiros/Lanchonetes");
						 verificar3 = sc.nextInt();
						 sc.nextLine();
						 if(verificar3 == 1)
						 {
							 System.out.println("1- Adicionar\n2- Verificar");
							 verificar4 = sc.nextInt();
							 sc.nextLine();
							 if(verificar4 == 1)
							 {
								 quantosestadios++;
								 System.out.println("Adicionou um estadio ao clube!");
							 }
							 if(verificar4 == 2)
							 {
								 System.out.printf("Estadios do clube: %d\n", quantosestadios);
							 }
						 }
						 else if(verificar3 == 2)
						 {
							 if(quantosestadios >= 1)
							 {
								 System.out.printf("O Clube tem disponibilidade de %d estadios para jogos em casa\n", quantosestadios);
							 }
							 else
							 {
								 System.out.println("Não temos estádios ou disponibilidades para jogos em casa!");
							 }
						 }
						 else
						 {
							 if(quantosestadios >= 1)
							 {
							 System.out.println("Quantos torcedores podem assistir o jogo nesse estádio?");
							 numEspec = sc.nextInt();
							 sc.nextLine();
							 System.out.println("Quantos banheiros temos nesse estádio?");
							 numBanheiros = sc.nextInt();
							 sc.nextLine();
							 System.out.println("Quantos lanchonetes temos nesse estádio?");
							 numLanchonetes = sc.nextInt();
							 sc.nextLine();
							 }
							 else
							 {
								 System.out.println("Não temos estádio");
							 }
						 }
						 break;
						 
					 case 3: //CT
						 System.out.println("1- Disponibilidade de CT\n2- Dormitorios disponiveis");
						 verificar5 = sc.nextInt();
						 sc.nextLine();
						 if(verificar5 == 1)
						 {
							 System.out.println("Temos CT's?");
							 System.out.println("1- SIM\n 2- NÃO");
							 escolhaCt = sc.nextInt();
							 sc.nextLine();
							 if(escolhaCt == 1)
							 {
								 System.out.println("Dormitórios disponíveis?");
								 numDormi = sc.nextInt();
								 sc.nextLine();
							 }
							 else
							 {
								 System.out.println("Não temos dormitórios, procurar hotel mais próximo!");
							 }
						 }
						 else
						 {
							 System.out.printf("Temos %d dormitorios para uso dos nosso atletas!\n", numDormi);
						 }
						 break;
						 
						 
					 } // chaves do switch case
					
				} // chaves do else if recursos (3)
				
				else if (escolherFuncio == 4)
				{
					System.out.println("Administrar\n1- Funcionários\n2- Recursos Físicos\n3- Sócio Torcedor");
					controle4 = sc.nextInt(); // para ler o caso do switch
					sc.nextLine(); // equivale ao getchar em C
					int escolha, i, j;
					
					switch(controle4)
					{
					case 1: // Funcionários
						System.out.println("1- Time\n2- Serviços Gerais");
						 escolha = sc.nextInt();
						 sc.nextLine();
	
						 if(escolha == 1)
						 {
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Tecnico")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Jogador")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 7; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
									System.out.println("Jogador está apto para jogar?");
									System.out.printf("%s\n", tabela[i][7]);
								}
							 }
						 }
						 else
						 {
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Medico")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Preparador fisico")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Motorista")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Cozinheiro")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
							 for (i=0; i < 100; i++)
							 {
								if(tabela[i][0] == "Advogado")
								{
									System.out.printf("------------\n", i);
									for (j=0; j < 6; j++)
									{
										System.out.printf("%s\n", tabela[i][j]);
									}
								}
							 }
						 }
						 break;
						 
					case 2: // Recursos físicos
						System.out.println("Relatório sobre:\n1- Transporte\n2- CT\n3- Estádio");
						int escolhendo;
						escolhendo = sc.nextInt(); // para ler o caso do switch
						sc.nextLine(); // equivale ao getchar em C
						if(escolhendo == 1)
						{
							System.out.println("Queremos saber quantos ônibus temos disponivel para uso?\n1- SIM\n2- NÃO");
							int saber;
							saber = sc.nextInt(); // para ler o caso do switch
							sc.nextLine(); // equivale ao getchar em C
							if(saber == 1)
							{
								System.out.printf("Temos %d ônibus para o uso da nossa equipe!\n", quantosbus);
							}
						}
						if(escolhendo == 2)
						{
							System.out.println("Informações sobre o CT:");
							if(escolhaCt >= 1)
							{
								System.out.printf("Temos %d CT's disponiveis, com %d dormitorios para uso dos nossos atletas\n", escolhaCt, numDormi);
							}
							else
							{
								System.out.println("Não temos estádio!");
							}
						}
						if(escolhendo == 3)
						{
							System.out.println("Informações sobre o estádio:");
							if(quantosestadios >= 1)
							{
								System.out.printf("Temos %d estádios, com uma estrutura para acolher %d espectadores tendo %d de banheiros disponíveis ao público e %d lanchonetes espalhadas pelo entorno do estádio\n",quantosestadios , numEspec, numBanheiros, numLanchonetes);
							}
							else 
							{
								System.out.println("Não temos estádio!");
							}
						}
						break;
						
					case 3:
						System.out.println("Relatório sobre sócio torcedor:");
						System.out.printf("Quantidade de sócios: %d\n", numSocio);
						System.out.printf("Quantidade de sócios adimplentes: %d\n", contadoradi);
						System.out.printf("Quantidade de sócios inadimplentes: %d\n", contadorina);
						System.out.println("Dados gerais dos sócios");
						 for (i=0; i < numSocio; i++)
						 {
								System.out.printf("------------\n", i);
								for (j=0; j < 6; j++)
								{
									System.out.printf("%s\n", socio[i][j]);
								}
						 }
						 break;
				
					}
					
				} // chaves do else if de relatório (4)
				
				else if (escolherFuncio == 5)
				{
					System.out.println("Obrigado por usar nosso sistema!");
					System.exit(0);
				}
				 
			}// chaves do while de encerramento	
			
			} // while do login e senha
			System.out.println("Login ou senha errados!");	 
			}
		}


