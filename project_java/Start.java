import java.util.Scanner;
import java.util.Formatter;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.lang.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
public class Start
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		boolean choice = true;

		try{
			while(choice)
		{
			
									System.out.println("*_______________________*\n");
									System.out.println("*_______________________*\n");
									System.out.println("*_______________________*\n");
									System.out.println("*     WELCOME to        *\n");
									System.out.println("*  SCHOOL INFORMATION   *\n");
									System.out.println("*  MANAGEMENT SYSTEM    *\n");
						            System.out.println("*_______________________*\n");
								    System.out.println("*_______________________*\n");
								    System.out.println("*_______________________*\n");

									System.out.println("______________0000000000_____________\n"); 

									System.out.println("KINDLY PROVIDE YOUR IDENTITY BELOW : ");

									System.out.println("1. AUTHORITY");
						            System.out.println("2. EXIT");
									System.out.println("______________0000000000_____________\n");

							int option1 = sc.nextInt();

							
								switch(option1)
							{
								case 1:
								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");


							    System.out.println("CONGRATULATIONS.\n");
								System.out.println("YOU HAVE CHOSEN AUTHORITY SECTION.");

								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");

							   System.out.println(" PLEASE CHOOSE WHICH SECTION YOU WOULD LIKE TO ACCESS.");
								
								System.out.println("1.TEACHER.");
								System.out.println("2.STUDENT");
								System.out.println("3.STUFF");

							
								System.out.println("*______________0000000000_____________*\n");

								

								int catagory = sc.nextInt();
								
								

								switch(catagory)
								{
									case 1:
								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");


							    System.out.println("    CONGRATULATIONS.      \n");
								System.out.println("YOU HAVE CHOSEN TEACHER SECTION.\n");

								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
								

									System.out.println("PLEASE CHOOSE A OPTION TO WORK WITH :\n");
									System.out.println("1.ADD NEW TEACHER.");
									
									System.out.println("2.SEARCH FOR ALL TEACHER'S INFORMATION");
									System.out.println("3.EXIT");
									int cc2 = sc.nextInt();
									switch(cc2){
									
										case 1:
										try {
									    System.out.println("*___ENTER REQUIRED ALL INFORMATIONS__*");
										String all = sc.nextLine();
										System.out.println("ENTER TEACHER'S ID NUMBER: ");
						                int id = Integer.parseInt(sc.nextLine());

						                System.out.println("_______________________________");

					                    System.out.println("ENTER TEACHER'S NAME : ");
										String name = sc.nextLine();
										System.out.println("_______________________________");
										System.out.println("ENTER TEACHER'S GMAIL ACCOUNT : ");
						                String gmail = sc.nextLine();
						                System.out.println("_______________________________");

						                System.out.println("ENTER TEACHER'S AGE : ");
						                int age = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

						                System.out.println("ENTER TEACHER'S PHONE NUMBER : ");
						                int number = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

							            FileWriter fw = new FileWriter("AddTeacher.txt",true);
										Formatter f3 = new Formatter(fw);
							            f3.format("%s %s %s %s %s %s \r\n",all,id,name,gmail,age,number);
							            f3.close();
							            System.out.println("                                 ");

							            System.out.println("    CONGRATULATIONS.             ");

							            System.out.println("                                 ");
							            System.out.println("_______________________________");
							            System.out.println("                                 ");
							            System.out.println(" NEW TEACHER ADDED SUCCESSFULLY ");
							            System.out.println("                                 ");
							            System.out.println("*______________0000000000_____________*\n");

							            } catch (IOException e) {
							            System.out.println("AN ERROR OCCURED");
							            e.printStackTrace();
							            
									    }catch(InputMismatchException e){
									    	System.out.println("INPUTMISMATCH ERROR");
									    	e.printStackTrace();
									    }catch (NumberFormatException e){
									    	System.out.println("NUMBER FORMAT ERROR");
									    	e.printStackTrace();
										   }
										break;
										
										case 2: 
										try {
											System.out.println("_______________________________");
											System.out.println("                               ");

								            System.out.println("        CONGRATULATIONS.       ");

								            System.out.println("                               ");

								            System.out.println("_______________________________");

								            System.out.println(" BELOW SHOWING YOU ALL THE INFORMATION OF TEACHERS :  ");

								            


										      File myObj = new File("AddTeacher.txt");
										      Scanner myReader = new Scanner(myObj);
										      while (myReader.hasNextLine()) {
										        String data = myReader.nextLine();
										        System.out.println(data);
										      }
										      myReader.close();





										      System.out.println("_______________________________");






										      System.out.println("*______________0000000000_____________*\n");
										    } catch (FileNotFoundException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
												break;
												case 3:
												System.out.println("exits");
												break;
												default:
											System.out.println("Invaild Option");
											break;

											}break;
										case 2:
										System.out.println("*_______________________*\n");
									    System.out.println("*_______________________*\n");
									    System.out.println("*_______________________*\n");


									    System.out.println("CONGRATULATIONS.\n");
										System.out.println("YOU HAVE CHOSEN STUDENT SECTION.\n");

										System.out.println("*_______________________*\n");
									    System.out.println("*_______________________*\n");
									    System.out.println("*_______________________*\n");
											
									System.out.println("PLEASE CHOOSE A OPTION TO WORK WITH :\n");
									System.out.println("1.ADD NEW STUDENT.");
									
									System.out.println("3.SEACHER FOR ALL STUDENT'S INFORMATION");
									System.out.println("4.EXIT");
									int cc2a = sc.nextInt();
									switch (cc2a){
										case 1:
								    	try {
									    System.out.println("*___ENTER REQUIRED ALL INFORMATIONS__*");
										String all = sc.nextLine();
										System.out.println("ENTER STUDENT'S ID NUMBER: ");
						                int id = Integer.parseInt(sc.nextLine());

						                System.out.println("_______________________________");

					                    System.out.println("ENTER STUDENT'S NAME : ");
										String name = sc.nextLine();
										System.out.println("_______________________________");
										System.out.println("ENTER STUDENT'S GMAIL ACCOUNT : ");
						                String gmail = sc.nextLine();
						                System.out.println("_______________________________");

						                System.out.println("ENTER STUDENT'S AGE : ");
						                int age = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

						                System.out.println("ENTER STUDENT'S PHONE NUMBER : ");
						                int number = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

							            FileWriter fw = new FileWriter("AddStudent.txt",true);
										Formatter f3 = new Formatter(fw);
							            f3.format("%s %s %s %s %s %s \r\n",all,id,name,gmail,age,number);
							            f3.close();
							            System.out.println("                                 ");

							            System.out.println("    CONGRATULATIONS.             ");

							            System.out.println("                                 ");
							            System.out.println("_______________________________");
							            System.out.println("                                 ");
							            System.out.println(" NEW STUDENT ADDED SUCCESSFULLY ");
							            System.out.println("                                 ");
							            System.out.println("*______________0000000000_____________*\n");

							            }


							            catch (IOException e) {
							            System.out.println("AN ERROR OCCURED");
							            e.printStackTrace();
							            
									    }catch(InputMismatchException e){
									    	System.out.println("INPUT MIS MATCH ERROR");
									    	e.printStackTrace();
									    }catch (NumberFormatException e){
									    	System.out.println("NUMBER FORMAT ERROR");
									    	e.printStackTrace();
										   }//System.out.println("Student adding process");
										break;
										
										case 2: 
										try {
											System.out.println("_______________________________");
											System.out.println("                               ");

								            System.out.println("        CONGRATULATIONS.       ");

								            System.out.println("                               ");

								            System.out.println("_______________________________");

								            System.out.println(" BELOW SHOWING YOU ALL THE INFORMATION OF STUDENT :  ");

								            


										      File myObj = new File("AddStudent.txt");
										      Scanner myReader = new Scanner(myObj);
										      while (myReader.hasNextLine()) {
										        String data = myReader.nextLine();
										        System.out.println(data);
										      }
										      myReader.close();
										      System.out.println("_______________________________");

										      System.out.println("*______________0000000000_____________*\n");
										    } catch (FileNotFoundException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										break;
										case 3:
										System.out.println("exits");
										break;
										default:
									System.out.println("Invaild Option");
									break;

									
									}
									break;

									case 3:
								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");


							    System.out.println("CONGRATULATIONS.\n");
								System.out.println("YOU HAVE CHOSEN STUFF SECTION.\n");

								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("PLEASE CHOOSE A OPTION TO WORK WITH :\n");
									System.out.println("1.Security");
									System.out.println("2.Cleaner");
									;
									
									

									int section = sc.nextInt();
									

								    switch(section)
								    {
								    	case 1:
								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");


							    System.out.println("CONGRATULATIONS.\n");
								System.out.println("YOU HAVE CHOSEN SECURITY SECTION.\n");

								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
								    	
								    System.out.println("PLEASE CHOOSE A OPTION TO WORK WITH :\n");
									System.out.println("1.ADD NEW SECURITY MEMBER.");
									
									System.out.println("2.SEACHER FOR ALL SECURITY'S INFORMATION");
									System.out.println("3.EXIT");
									int security = sc.nextInt();
									switch (security){
										case 1 :
										try {
									    System.out.println("*___ENTER REQUIRED ALL INFORMATIONS__*");
										String all = sc.nextLine();
										System.out.println("ENTER SECURITY'S ID NUMBER: ");
						                int id = Integer.parseInt(sc.nextLine());

						                System.out.println("_______________________________");

					                    System.out.println("ENTER SECURITY'S NAME : ");
										String name = sc.nextLine();
										System.out.println("_______________________________");
										
						                System.out.println("ENTER SECURITY'S AGE : ");
						                int age = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

						                System.out.println("ENTER SECURITY'S PHONE NUMBER : ");
						                int number = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

							            FileWriter fw = new FileWriter("AddSecurity.txt",true);
										Formatter f3 = new Formatter(fw);
							            f3.format("%s %s %s %s %s \r\n",all,id,name,age,number);
							            f3.close();
							            System.out.println("                                 ");

							            System.out.println("    CONGRATULATIONS.             ");

							            System.out.println("                                 ");
							            System.out.println("_______________________________");
							            System.out.println("                                 ");
							            System.out.println(" NEW SECURITY MEMBER ADDED SUCCESSFULLY ");
							            System.out.println("                                 ");
							            System.out.println("*______________0000000000_____________*\n");

							            }


							            catch (IOException e) {
							            System.out.println("AN ERROR OCCURED");
							            e.printStackTrace();
							            
									    }catch(InputMismatchException e){
									    	System.out.println("INPUTMISMATCH ERROR");
									    	e.printStackTrace();
									    }catch (NumberFormatException e){
									    	System.out.println("NUMBER FORMAT ERROR");
									    	e.printStackTrace();
										   }
										break;
										
										case 2 :
										try {
											System.out.println("_______________________________");
											System.out.println("                               ");

								            System.out.println("        CONGRATULATIONS.       ");

								            System.out.println("                               ");

								            System.out.println("_______________________________");

								            System.out.println(" BELOW SHOWING YOU ALL THE INFORMATION OF SECURITY :  ");

								            


										      File myObj = new File("AddSecurity.txt");
										      Scanner myReader = new Scanner(myObj);
										      while (myReader.hasNextLine()) {
										        String data = myReader.nextLine();
										        System.out.println(data);
										      }
										      myReader.close();
										      System.out.println("_______________________________");

										      System.out.println("*______________0000000000_____________*\n");
										    } catch (FileNotFoundException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										break;
										case 3:
										System.out.println("exits");
										break;

									    default:
									    System.out.println("Invalid option");
									    break;
									}
										break;


										case 2:
								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");


							    System.out.println("*CONGRATULATIONS.\n");
								System.out.println("*YOU HAVE CHOSEN CLEANER SECTION.\n");

								System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
							    System.out.println("*_______________________*\n");
								    	
								    System.out.println("PLEASE CHOOSE A OPTION TO WORK WITH :\n");
									System.out.println("1.ADD NEW CLEANER MEMBER.");
									
									System.out.println("2.SEACHER FOR ALL CLEANER'S INFORMATION");
									System.out.println("3.EXIT");
									int cleaner = sc.nextInt();
									switch(cleaner) {

										case 1 :
										try {
									    System.out.println("*___ENTER REQUIRED ALL INFORMATIONS__*");
										String all = sc.nextLine();
										System.out.println("ENTER CLEANER'S ID NUMBER: ");
						                int id = Integer.parseInt(sc.nextLine());

						                System.out.println("_______________________________");

					                    System.out.println("ENTER CLEANER'S NAME : ");
										String name = sc.nextLine();
										System.out.println("_______________________________");
										

						                System.out.println("ENTER CLEANER'S AGE : ");
						                int age = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

						                System.out.println("ENTER CLEANER'S PHONE NUMBER : ");
						                int number = Integer.parseInt(sc.nextLine());
						                System.out.println("_______________________________");

							            FileWriter fw = new FileWriter("AddCleaner.txt",true);
										Formatter f3 = new Formatter(fw);
							            f3.format("%s %s %s %s %s \r\n",all,id,name,age,number);
							            f3.close();
							            System.out.println("                                 ");

							            System.out.println("    CONGRATULATIONS.             ");

							            System.out.println("                                 ");
							            System.out.println("_______________________________");
							            System.out.println("                                 ");
							            System.out.println(" NEW CLEANER MEMBER ADDED SUCCESSFULLY ");
							            System.out.println("                                 ");
							            System.out.println("*______________0000000000_____________*\n");

							            }


							            catch (IOException e) {
							            System.out.println("AN ERROR OCCURED");
							            e.printStackTrace();
							            
									    }catch(InputMismatchException e){
									    	System.out.println("INPUTMISMATCH ERROR");
									    	e.printStackTrace();
									    }catch (NumberFormatException e){
									    	System.out.println("NUMBER FORMAT ERROR");
									    	e.printStackTrace();
										   }
										break;
										
										case 2 :
										try {
											System.out.println("_______________________________");
											System.out.println("                               ");

								            System.out.println("        CONGRATULATIONS.       ");

								            System.out.println("                               ");

								            System.out.println("_______________________________");

								            System.out.println(" BELOW SHOWING YOU ALL THE INFORMATION OF CLEANER :  ");

								            


										      File myObj = new File("AddCleaner.txt");
										      Scanner myReader = new Scanner(myObj);
										      while (myReader.hasNextLine()) {
										        String data = myReader.nextLine();
										        System.out.println(data);
										      }
										      myReader.close();
										      System.out.println("_______________________________");

										      System.out.println("*______________0000000000_____________*\n");
										    } catch (FileNotFoundException e) {
										      System.out.println("An error occurred.");
										      e.printStackTrace();
										    }
										break;
										case 3:
										System.out.println("exits");
										break;

									    default:
									    System.out.println("Invalid option");
									    break;
									}
								    	
										break;
										case 3:
										System.out.println("EXIT");
										break;

										default:
										System.out.println("INVALID OPTION CHOOSED");
										break;
								    }
								    
								    default:
									System.out.println("INVALID OPTION CHOOSED");
									break;
								}
								break;
							case 2:
							System.out.println("EXIT");
							break;
					    
							default:
							System.out.println("INVALID OPTION CHOOSED");
						    break;
							
						    }
						}
							}catch(NumberFormatException e){
								System.out.println("ERROR PLEASE PROVIDE VALID INPUT");
								e.printStackTrace();
							     }
							     catch(InputMismatchException e){
							     	System.out.println("ERROR! MIS MATCH EXCEPTION PLEASE PROVIDE RIGHT KEYWORD");
							     	e.printStackTrace();
							     }catch(IllegalArgumentException e){
							     	System.out.println("ERROR ILLEGAL EXCEPTION PLEASE PROVIDE RIGHT KEYWORD");
							     }		     
					} 

				};