/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Ejercicios_capitulo10.CabinRental;
import Ejercicios_capitulo10.Candle;
import Ejercicios_capitulo10.Car;
import Ejercicios_capitulo10.CarRental;
import Ejercicios_capitulo10.CarWheelInvalidException;
import Ejercicios_capitulo10.CollegeCourse;
import Ejercicios_capitulo10.CollegeEmployee;
import Ejercicios_capitulo10.Colors;
import Ejercicios_capitulo10.Departament;
import Ejercicios_capitulo10.Escencia;
import Ejercicios_capitulo10.Faculty;
import Ejercicios_capitulo10.HolidayCabinRental;
import Ejercicios_capitulo10.Horse;
import Ejercicios_capitulo10.IlegalDayException;
import Ejercicios_capitulo10.InvalidDayException;
import Ejercicios_capitulo10.LeapYear;
import Ejercicios_capitulo10.Medio;
import Ejercicios_capitulo10.RaceHorse;
import Ejercicios_capitulo10.Raza;
import Ejercicios_capitulo10.ScentedCandle;
import Ejercicios_capitulo10.Year;
import Ejercicios_capitulo10.Package;
import Ejercicios_capitulo10.InsuredPackage;
import Ejercicios_capitulo10.LabCourse;
import Ejercicios_capitulo10.LexuryCarRental;
import Ejercicios_capitulo10.MotorCycle;
import Ejercicios_capitulo10.MotorCycleWheelInvalidException;
import Ejercicios_capitulo10.VehicleSize;
import Ejercicios_capitulo11.Actor;
import Ejercicios_capitulo11.Auto;
import Ejercicios_capitulo11.Book;
import Ejercicios_capitulo11.Chevrolet;
import Ejercicios_capitulo11.Child;
import Ejercicios_capitulo11.DomesticDivision;
import Ejercicios_capitulo11.Element;
import Ejercicios_capitulo11.Fiction;
import Ejercicios_capitulo11.Figure;
import Ejercicios_capitulo11.Ford;
import Ejercicios_capitulo11.GeometricFigure;
import Ejercicios_capitulo11.Health;
import Ejercicios_capitulo11.IncomingPhoneCall;
import Ejercicios_capitulo11.InsuranceException;
import Ejercicios_capitulo11.InternationalDivision;
import Ejercicios_capitulo11.Life;
import Ejercicios_capitulo11.Maker;
import Ejercicios_capitulo11.MetalElement;
import Ejercicios_capitulo11.Musician;
import Ejercicios_capitulo11.NonFiction;
import Ejercicios_capitulo11.NonMetalElement;
import Ejercicios_capitulo11.Novel;
import Ejercicios_capitulo11.Novella;
import Ejercicios_capitulo11.OutgoingPhoneCall;
import Ejercicios_capitulo11.PhoneCall;
import Ejercicios_capitulo11.SevenDaySubscriber;
import Ejercicios_capitulo11.ShortStory;
import Ejercicios_capitulo11.Square;
import Ejercicios_capitulo11.Story;
import Ejercicios_capitulo11.Subscription;
import Ejercicios_capitulo11.SubscriptorsException;
import Ejercicios_capitulo11.Triangle;
import Ejercicios_capitulo11.WeekdaySubscriber;
import Ejercicios_capitulo11.WeekendSubscriber;
import Ejercicios_capitulo11.FullTime;
import Ejercicios_capitulo11.Grades;
import Ejercicios_capitulo11.PartTime;
import Ejercicios_capitulo2.CarlysEventPrice;
import Ejercicios_capitulo2.DogBoarding;
import Ejercicios_capitulo2.Dollars;
import Ejercicios_capitulo2.Eggs;
import Ejercicios_capitulo2.FahrenheitToCelsius;
import Ejercicios_capitulo2.InchesToFeet;
import Ejercicios_capitulo2.InchesToFeetInteractive;
import Ejercicios_capitulo2.Initials;
import Ejercicios_capitulo2.MilesToFeet;
import Ejercicios_capitulo2.MilesToFeetInteractive;
import Ejercicios_capitulo2.ProjectedSales;
import Ejercicios_capitulo2.ProjectedSalesInteractive;
import Ejercicios_capitulo2.SammysRentalPrice;
import Ejercicios_capitulo2.TicketNumber;
import Ejercicios_capitulo3.ArithmeticMethods;
import Ejercicios_capitulo3.ArithmeticMethods2;
import Ejercicios_capitulo3.BankAccount;
import static Ejercicios_capitulo3.BankAccount.getData;
import static Ejercicios_capitulo3.BankAccount.showValues;
import Ejercicios_capitulo3.CarlysEventPriceWithMethods;
import static Ejercicios_capitulo3.CarlysEventPriceWithMethods.display;
import static Ejercicios_capitulo3.CarlysEventPriceWithMethods.logica;
import static Ejercicios_capitulo3.CarlysEventPriceWithMethods.solicitud;
import Ejercicios_capitulo3.Event;
import static Ejercicios_capitulo3.EventDemo.getEventNumber;
import Ejercicios_capitulo3.GasPrice;
import Ejercicios_capitulo3.Insuranc;
import Ejercicios_capitulo3.Interest;
import Ejercicios_capitulo3.MetricConversion;
import Ejercicios_capitulo3.PaintCalculator;
import Ejercicios_capitulo3.Painting;
import static Ejercicios_capitulo3.Painting.entradaDatos;
import Ejercicios_capitulo3.Percentages;
import Ejercicios_capitulo3.Percentages2;
import Ejercicios_capitulo3.Rental;
import Ejercicios_capitulo3.Salary;
import Ejercicios_capitulo3.SammysRentalPriceWithMethods;
import static Ejercicios_capitulo3.SammysRentalPriceWithMethods.lemaBorde;
import static Ejercicios_capitulo3.SammysRentalPriceWithMethods.minutes;
import Ejercicios_capitulo3.Sandwich;
import Ejercicios_capitulo3.Student;
import Ejercicios_capitulo4.Billing;
import Ejercicios_capitulo4.BirdSighting;
import Ejercicios_capitulo4.BirdSighting2;
import Ejercicios_capitulo4.BloodData;
import Ejercicios_capitulo4.Bread;
import Ejercicios_capitulo4.Circle;
import Ejercicios_capitulo4.FormLetterWriter;
import Ejercicios_capitulo4.MathTest;
import Ejercicios_capitulo4.Patient;
import Ejercicios_capitulo4.SandwichFilling;
import Ejercicios_capitulo4.State;
import Ejercicios_capitulo4.TwoDice;
import com.course.buildings.Building;
import com.course.buildings.House;
import com.course.buildings.School;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Main {
    public static void main(String[] args)throws InvalidDayException, IlegalDayException,CarWheelInvalidException, MotorCycleWheelInvalidException,SubscriptorsException,InsuranceException{
    
                  //MilesToFeet
                MilesToFeet mile = new MilesToFeet();
                mile.Miles();
                
                
                //MilesToInteractive 
               MilesToFeetInteractive miles = new MilesToFeetInteractive();
               miles.Inter(5, 6);
               
               //PojectedSales
               ProjectedSales pro = new ProjectedSales();
               pro.projec();
               
               
               //PojectedSalesInteractive
                ProjectedSalesInteractive proj = new ProjectedSalesInteractive();
                proj.inter(4000, 5500);
                
                //InchesToFeet
                InchesToFeet inch = new InchesToFeet();
                inch.Inches();
                
                //InchesToFeetInteractive
                InchesToFeetInteractive inche = new InchesToFeetInteractive();
                inche.InchesT(86);
                
                //iNITIALS
                Initials in = new Initials();
                in.Name();
                
                //Eggs
                Eggs egg = new Eggs();
                egg.egg(5);
                
                //DogBoarding
                DogBoarding dog = new DogBoarding();
                dog.Dog(20, 5);
                
                //Dollars
                Dollars dollar = new Dollars();
                dollar.dollar();
                
                //FahrenheitToCelsius
                FahrenheitToCelsius fa = new FahrenheitToCelsius();
                fa.conversion(20);
                
                //TicketNumber
                TicketNumber ticket = new TicketNumber();
                ticket.Ticket("12345");
                
                //CarlysEventPrice
                CarlysEventPrice carl = new CarlysEventPrice();
                carl.Carl(51);
                
                //SammysRentalPrice
                SammysRentalPrice samm = new SammysRentalPrice();
                samm.Samm(50);
                
                
                //Empiezan ejercicios capitulo 3
                //ArithmeticMethods
                ArithmeticMethods ari = new ArithmeticMethods();
                ari.displayNumberPlus10();
                ari.displayNumberPlus100();
                ari.displayNumberPlus1000();
                
                //ArithmeticMethods2
                ArithmeticMethods2 arit = new ArithmeticMethods2();
                arit.displayNumberPlus10(25, 9);
                arit.displayNumberPlus100(25, 9);
                arit.displayNumberPlus1000(25, 9);
                
                //PErcentages
                Percentages per = new Percentages();
                per.computePercent();
                
                //Percentages2
                Percentages2 per2 = new Percentages2();
                per2.computePercent(2, 3);
                
                //GasPrice
                GasPrice gas = new GasPrice();
                gas.price(5);
                
                //MetricConversion
                MetricConversion me = new MetricConversion();
                me.gallonsToLiters(5);
                me.inchesTocentimeters(10);
                
                //PaintCalculator
                PaintCalculator paint = new PaintCalculator();
                paint.calcularArea(1, 2, 3);
                        
                //Insurance 
                Insuranc da = new Insuranc();
                da.CalcularPrima(2019, 1998);
                
                //Salary
                Salary sal = new Salary();
                sal.pagoHorasExtras(12, 15, 2);
                
                //Interes
                Interest inte = new Interest();
                inte.calcularInversion(200);
                
                //SANDWICH Y TES
                Sandwich emparedado = new Sandwich();
		emparedado.setBreadType("trigo");
		emparedado.setMainIngredient("atun");
		emparedado.setPrice(4.99);
		String mainIngredient = emparedado.getMainIngredient(); 
		String breadType = emparedado.getBreadType();
		double price  = emparedado.getPrice(); 
		System.out.println( "Ingrediente principal: "+mainIngredient);
		System.out.println( "Tipo de pan: "+ breadType);
		System.out.println( "Precio :"+price);
                
                
                
                //Studen SHOWStudent 
                Student student = new Student();
		student.setIdNumber(1234);
		student.setNumberCreditsE(3);
		student.setNumberPointE(12);
		
		double gradePoint=student.calcularGradePoint(
                student.getNumberPointE(),student.getNumberCreditsE());
		
		student.setGradePointAverage(gradePoint);
		
		System.out.println("ID: "+student.getIdNumber());
		System.out.println("Numero de creditos: "+student.getNumberCreditsE());
		System.out.println("Numero de puntos: "+student.getNumberPointE());
		System.out.println("promedio: "+student.getGradePointAverage());
                //ShowStuden2
                Student studen = new Student();
		
		System.out.println("ID: "+studen.getIdNumber());
		System.out.println("Numero de creditos: "+studen.getNumberCreditsE());
		System.out.println("Numero de puntos: "+studen.getNumberPointE());
		System.out.println("promedio: "+studen.getGradePointAverage());
                
                
                //BankAccount y TesBankAccount
                BankAccount cuenta1=getData();
		BankAccount cuenta2=getData();
		BankAccount cuenta3=getData();
		BankAccount cuenta4 = new BankAccount();
		showValues(cuenta1);
		showValues(cuenta2);
		showValues(cuenta3);
		showValues(cuenta4);
                
                
                //Painting
                Painting pintar =  entradaDatos();
		Painting pintar2 = entradaDatos();
		Painting pintar3 = new Painting();
		System.out.println("**********************************************************************");
		System.out.println(pintar.toString());
		System.out.println("**********************************************************************");
		System.out.println(pintar2.toString());
		System.out.println("**********************************************************************");
		System.out.println(pintar3.toString());
		System.out.println("**********************************************************************");
		System.out.println("El campo de comisiï¿½n de la galerï¿½a se calcula como el 20 por ciento del precio cada vez que se establece el precio.");
		System.out.println("**********************************************************************");
                
                //Event
                //CarlysEventPriceWithMethods
                int invitados =solicitud();
		display();
		logica(invitados);
                //EventDemo
                Event evento = new Event();
		evento.setNumberOfGuestsForEvent(solicitud());
		evento.setEventNumber(getEventNumber());
		new CarlysEventPriceWithMethods().display();
		System.out.println(evento.toString()); 
                
                
                //Rental
                 Integer minutoos = minutes();
		 
		Rental object = new Rental();
		
		object.setHoursAndMinutes(minutoos);
		new SammysRentalPriceWithMethods().lemaBorde();
		System.out.println(object.toString()); 
                
                Integer minutos = minutes();
		lemaBorde();
		logica(minutoos);
                
                //FormLetterWriter
                FormLetterWriter form = new FormLetterWriter();
                form.displaySalutation("darwin");
                form.displaySalutation("darwin", "diaz");
               
                //Billing
                Billing data = new Billing();
                data.sol();
                
                //TestBirdSighting
                
		BirdSighting bird = new BirdSighting();
		System.out.println("Especie: "+bird.getBirdSpecies());
		System.out.println("Numero de vistas: "+bird.getNumberSeen());
		System.out.println("Numero de dï¿½a: "+bird.getNumerDay());
                
                //TestBirdSighting2
                BirdSighting2 bird2 = new BirdSighting2("Colibri",5,12);
		System.out.println("Especie: "+bird2.getBirdSpecies());
		System.out.println("Numero de vistas: "+bird2.getNumberSeen());
		System.out.println("Numero de dï¿½a: "+bird2.getNumerDay());
                
                //TestBloodDato
                BloodData blood = new BloodData();
		System.out.println("Tipo de sangre: "+blood.getBloodType());
		System.out.println("Factor RH: "+blood.getFactorRH());
		
		
		BloodData blood2 = new BloodData("AB",'-');
		System.out.println("Tipo de sangre: "+blood2.getBloodType());
		System.out.println("Factor RH: "+blood2.getFactorRH());
                
                //TestPatient
                Patient patient1 = new Patient();
		System.out.println(patient1.getEdad());
		System.out.println(patient1.getId());
		System.out.println(patient1.getBlood().getBloodType());
		System.out.println(patient1.getBlood().getFactorRH());
		
		
		BloodData bloode = new BloodData();
		blood.setBloodType("O");
		blood.setFactorRH('-');
		
		Patient patient2 = new Patient(1,20,blood);
		System.out.println(patient2.getEdad());
		System.out.println(patient2.getId());
		System.out.println(patient2.getBlood().getBloodType());
		System.out.println(patient2.getBlood().getFactorRH());
                
                //TestSandwichFilling
                SandwichFilling sandwich1 = new SandwichFilling("jamon y lechiga", 450);
		SandwichFilling sandwich2 = new SandwichFilling("huevo y salchicha", 750);
		SandwichFilling sandwich3 = new SandwichFilling("pollo y tomate", 250);
		
		
		System.out.println(sandwich1.getTypeFilling());
		System.out.println(sandwich1.getCalorias());
		
		
		System.out.println(sandwich2.getTypeFilling());
		System.out.println(sandwich2.getCalorias());
		
		
		System.out.println(sandwich3.getTypeFilling());
		System.out.println(sandwich3.getCalorias());
                
                //TestBread
                Bread bread1= new Bread("ajo", 50);
		Bread bread2= new Bread("dulce", 300);
		Bread bread3= new Bread("integral", 100);
		
		System.out.println(bread1.getType());
		System.out.println(bread1.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread2.getType());
		System.out.println(bread2.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread3.getType());
		System.out.println(bread3.getCalories());
		System.out.println(bread1.getMessage());
                
                //TestSandwich
                
		Bread bread = new Bread("Ajo", 100);
		SandwichFilling sandwichFill = new SandwichFilling("jamon lechuga", 230);
		Sandwich sandwich = new Sandwich(bread, sandwichFill);
		
		//TestCircle
		Circle circulo = new Circle();
		circulo.setRadius(2.5);
		Circle circulo2 = new Circle();
		circulo2.setRadius(5.5);
		Circle circulo3 = new Circle();
	
		System.out.println("El radio del circulo 1 es: "+circulo.getRadius());
		System.out.println("El radio del circulo 2 es: "+circulo2.getRadius());
		System.out.println("El radio del circulo 3 es: "+circulo3.getRadius());
		
                
                //MathTest
                MathTest mat = new MathTest();
                mat.maat();
                
                
                //State
                State st = new State("OAXACA", 2, "JUAREZ", "OAXACA", "OAXACA", "OAXACA");
                st.getCapital();
                st.getCiudadP();
                st.getPob();
                
                
                
                
                TwoDice two = new TwoDice();
                two.dice();
        
        //horse
                Horse caballo = new Horse();
		caballo.setAñoNacimiento(2010);
		caballo.setColor(Raza.CATALAN);
		caballo.setNombre("Aquilani");
		
		RaceHorse deCarreras = new RaceHorse();
		deCarreras.setAñoNacimiento(2002);
		deCarreras.setColor(Raza.ARA_APALOOSA);
		deCarreras.setNombre("LUCIFER!");
		
		System.out.println( " Caballo Normal : \n " );
		
		System.out.println( " El Nombre del Caballo es : \t " + caballo.getNombre() );
		System.out.println( " La Raza del Caballo es : \t " + caballo.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo es : \t " + caballo.getAñoNacimiento() );
		
		System.out.println( " \n Caballo de Carreras : \n " );
		
		System.out.println( " El Nombre del Caballo de Carreras es : \t " + deCarreras.getNombre() );
		System.out.println( " La Raza del Caballo de Carreras es : \t " + deCarreras.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo de Carreras es : \t " + deCarreras.getAñoNacimiento()  );
        //candle
                Candle vela = new Candle();
		vela.setAltura(2.2);
		vela.setColor(Colors.AZUL);
		
		ScentedCandle aromatica = new ScentedCandle();
		aromatica.setAltura(4.0);
		aromatica.setColor(Colors.AMARILLO);
		aromatica.setScent(Escencia.EUCALIPTO);
		
		System.out.println( " Vela Normal : \n " );
		System.out.println( " El Color de la vela es : \t " + vela.getColor() );
		System.out.println( " La Altura de la Vela es : \t " + vela.getAltura() );
		System.out.println( " El Precio de la Vela es : \t $ " + vela.getPrecio() );
		
		System.out.println( " \n Vela Aromatica : \n " );
		System.out.println( " El Color de la vela Aromatica es : \t " + aromatica.getColor() );
		System.out.println( " LA Escencia de la Vela Aromatica es : \t " + aromatica.getScent() );
		System.out.println( " La Altura de la Vela Aromatica es : \t " + aromatica.getAltura() );
		System.out.println( " El Precio de la Vela Aromatica  es : \t $ " + aromatica.getPrecio() );
		
                //year
                Year año = new Year(200);
		Integer dia = año.daysElapsed(6, 17);
		System.out.println( " Dia Ingresado : \t" + año.getDays() );
		System.out.println( " Dia Dentro del Año : \t " + dia );
	
		LeapYear bi = new LeapYear(99);
		Integer f = bi.daysElapsed(5, 14);
		System.out.println( " \n Dia Ingresado : \t " + bi.getDays() );
		System.out.println( " Dia Dentro del Año Biciesto : \t " + f );
                
                //rental
                CabinRental cabina1 = new CabinRental(5);
		CabinRental cabina2 = new CabinRental(3);
		HolidayCabinRental cabina3 = new HolidayCabinRental(3);
		HolidayCabinRental cabina4 = new HolidayCabinRental(2);
		HolidayCabinRental cabina5 = new HolidayCabinRental(10);
		
		System.out.println( " El Numero de Cabina es : " + cabina1.getCabinNumber() + "   " +  
				" El Costo de la Cabina es : $ " + cabina1.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina2.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina2.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina3.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina3.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina4.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina4.getWeeklyRental() );
		System.out.println( " El Numero de Cabina es : " + cabina5.getCabinNumber() +  "   " +
				" El Costo de la Cabina es : $ " + cabina5.getWeeklyRental() );
		
		//Package
                Package paquete1 = new Package(5.00, Medio.TRUCK);
		paquete1.display();
		System.out.println( " \n El Precio de su Paquete es : $ " + paquete1.calculateCost() );
		
		InsuredPackage paquete2 = new InsuredPackage(4.200, Medio.AIR);
		paquete2.display();
		System.out.println( " \n El Precio de su Paquete Asegurado es : $ " + paquete2.additionalCost() );
		
		//car
                CarRental carro = new CarRental("Freed", 2100, VehicleSize.MID_SIZE, 4);
		carro.display();
		
		LexuryCarRental deLujo = new LexuryCarRental("Jordy", 4000, VehicleSize.MID_SIZE, 3);
		deLujo.display();
		LexuryCarRental lujo = new LexuryCarRental("Bob", 4010, VehicleSize.FULL_SIZE, 9);
		lujo.display(); 
                
                //course
                Scanner sc = new Scanner(System.in);
		int dep;
		
		System.out.println( " Escoja un Departamento : \n " );
		System.out.println( " 1. LENGUAGE, 2.LITERATURE, 3. SCIENCES, 4. SOCIAL_SCIENCES, "
				+ " 5. MATH, 6. PHYSICAL_EDUCATION, 7. BIO, 8. CHM,  9. CIS, 10. PHY " );
		dep = sc.nextInt();
		
		switch( dep ) {
		
		case 1 :
			
			CollegeCourse curso1 = new CollegeCourse(Departament.LENGUAGE, 101, 1);
			curso1.display();
			
			break;
			
		case 2: 
			
			CollegeCourse curso2 = new CollegeCourse(Departament.LITERATURE, 202, 2);
			curso2.display();
			
			break;
			
		case 3 :
			
			CollegeCourse curso3 = new CollegeCourse(Departament.SCIENCES, 303, 3);
			curso3.display();
			
			break;
			
		case 4 :
			
			CollegeCourse curso4 = new CollegeCourse(Departament.SOCIAL_SCIENCES, 404, 4);
			curso4.display();
			
			break;
			
		case 5 :
			
			CollegeCourse curso5 = new CollegeCourse(Departament.MATH, 505, 5);
			curso5.display();
			
			break;
			
		case 6 :
			
			CollegeCourse curso6 = new CollegeCourse(Departament.PHYSICAL_EDUCATION, 101, 1);
			curso6.display();
			
			break;
			
		case 7 :
			
			LabCourse bio = new LabCourse(Departament.BIO, 606, 6);
			bio.display();
			
			break;
			
		case 8 : 
			
			LabCourse chm = new LabCourse(Departament.CHM, 707, 7);
			chm.display();
			
			break;
			
		case 9 :
			
			LabCourse cis = new LabCourse(Departament.CIS, 808, 8);
			cis.display();
			
			break;
			
		case 10 : 
			
			LabCourse phy = new LabCourse(Departament.PHY, 909, 9);
			phy.display();
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Invalida!. \n Ingrese una Opcion Correcta " );
		
		
		}
                
                //car
                Car carros = new Car(5, (double) 10);
		MotorCycle moto = new MotorCycle(10, (double) 4);
		System.out.println( carros );
		System.out.println( moto );
                
                //CollegeList
                CollegeEmployee[] empleados = new CollegeEmployee[4];
		Faculty[] facultad = new Faculty[3];
		Student[] students = new Student[7];
		Scanner d = new Scanner(System.in);

		System.out.println( " Que Tipo de Persona Ingresara? \n C, F, S. \n");
		String c = d.next();
		
		switch ( c ) {
		
		case "C" :
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].inicializar();
				
			}
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].toString();
				
			}
			
			break;
			
		case "F" :
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].inicializar();
				
			}
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].toString();
				
			}
			
			break;
			
		case "S" :
			
			for (int i = 0; i < students.length; i++) {
				
				students.toString();
				
			}
			
			for (int i = 0; i < students.length; i++) {
				
				System.out.println( students[i].toString() );
				
			}
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Incorrecta. \n Verifique!. \n Ingrese una Opcion Valida!. \n "  );
			
			
		
		
		}
		//UseBook
                Fiction ficcion = new Fiction("Lord of Rings's Saga");
		System.out.println( ficcion.toString() );
		NonFiction real = new NonFiction("El Libro Vaquero");
		System.out.println( real.toString() );
		
                //bookarray
                Book[] libros = new Book[10];
		libros[0] = new Fiction("Ficcion 1");
		libros[1] = new Fiction("Ficcion 2");
		libros[2] = new Fiction("Ficcion 3");
		libros[3] = new Fiction("Ficcion 4");
		libros[4] = new Fiction("Ficcion 5");
		libros[5] = new NonFiction("Libro 1 " );
		libros[6] = new NonFiction("Libro 2 " );
		libros[7] = new NonFiction("Libro 3 " );
		libros[8] = new NonFiction("Libro 4 " );
		libros[9] = new NonFiction("Libro 5 " );
		
		for (int i = 0; i < libros.length; i++) {
			
			System.out.println( libros[i].toString()  );
			
		}
                
                //DemoPhoneCalls
                IncomingPhoneCall entrante = new IncomingPhoneCall("9512392190");
		System.out.println( entrante.getCallInformation() );
		
		OutgoingPhoneCall saliente = new OutgoingPhoneCall("951183110", 10.0);
		System.out.println( saliente.getCallInformation() );
                
                //PhoneCallArray
                PhoneCall[] llamadas = new PhoneCall[10];
		llamadas[0] = new IncomingPhoneCall("9511234");
		llamadas[1] = new IncomingPhoneCall("95112345");
		llamadas[2] = new IncomingPhoneCall("95112346");
		llamadas[3] = new IncomingPhoneCall("95112347");
		llamadas[4] = new IncomingPhoneCall("95112348");
		llamadas[5] = new OutgoingPhoneCall("951123", 10.0);
		llamadas[6] = new OutgoingPhoneCall("951123", 21.1);
		llamadas[7] = new OutgoingPhoneCall("9511234", 32.2);
		llamadas[8] = new OutgoingPhoneCall("9511235", 43.3);
		llamadas[9] = new OutgoingPhoneCall("9511236", 54.4);
		
		for (int i = 0; i < llamadas.length; i++) {
			
			System.out.println( llamadas[i].getCallInformation() );
			
		}
                
                //UseAuto
                Ford carro1 = new Ford(Maker.FORD, 20000.00);
		System.out.println( " \n La Marca del Carro es : \t " + carro1.getMarca() );
		System.out.println( " El Costo del Carro es : \t " + carro1.getPrice() );
		Chevrolet carro2 = new Chevrolet(Maker.CHEVROLET, 22000.00);
		System.out.println( " \n La Marca del Carro es : \t " + carro2.getMarca() );
		System.out.println( " El Costo del Carro es : \t " + carro2.getPrice() );
		
		System.out.println( " \n Con ArrayList : \n " );   // Interaccion con la Clase Auto. Con ArrayList ;)
		
		ArrayList<Auto> carross = new ArrayList<>();
		
		carross.add( new Ford(Maker.FORD, 40000.00) );
		carross.add( new Chevrolet(Maker.CHEVROLET, 44000.00 ) );
		carross.add( new Ford(Maker.BMW, 188900.50) );
		carross.add( new Chevrolet(Maker.AUDI, 244000.00 ) );
		carross.add( new Ford(Maker.MITSUBISHI, 110000.00) );
		carross.add( new Chevrolet(Maker.KIA,144000.00 ) );
		carross.add( new Ford(Maker.VOLSKWAGEN, 90000.00) );
		carross.add( new Ford(Maker.VOLVO, 111000.00) );
		
		for (Auto auto : carross) {
			
			System.out.println( " \n La Marca del Auto es : \t " + auto.getMarca() );
			System.out.println( " El Precio del Auto es : \t $ " + auto.getPrice() );
			
		}
                
                //UseDivision
                InternationalDivision ID = new InternationalDivision("Agropecuaria a.c.", 1234, "Mexico", "Español");
		ID.display();
		
		
		DomesticDivision DD = new DomesticDivision("SEPOMEX", 6123456, "Spañol" );
		DD.display();
                
                //ElementArray
		Element[] elementos = new Element[8];
				
				elementos[0] = new MetalElement("Al", 13, 26.9815386);
				elementos[1] = new MetalElement("Zn", 30, 65.38);
				elementos[2] = new MetalElement("Ga", 31, 69.723);
				elementos[3] = new NonMetalElement("H", 1, 1.00794);
				elementos[4] = new NonMetalElement("He", 2, 4.002602);
				elementos[5] = new NonMetalElement("C", 6, 12.0107);
				elementos[6] = new NonMetalElement("N", 7, 14.0067);
				elementos[7] = new NonMetalElement("O", 8, 15.9994);
				
				for (int i = 0; i < elementos.length; i++) {
					elementos[i].describeElement();
				}
		
                //Subscribers
		String direccion = null;
		Integer menu = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println( " Tipos de Servicio : \n " );
		System.out.println( " 1. Seven Day Subscriber. \n 2. Week Day Subscriber. \n 3. Weekend Subscriber. \n " );

		System.out.println( " Ingrese una Direccion para el Subscriptor. \n " );
		direccion = sc1.nextLine();
		
		System.out.println( " Ingrese el Tipo de Servicio : \n " );
		menu = sc1.nextInt();
		
		
		// Podia Haber Definido un Constructor y ahi se le Ponia lo Ingresado; y lo llamos con sus gets 
		// Asi; los Casos del Switch; Salian en 2 Lineas.
		
		switch ( menu ) {
		
		
		
		case 1 : 
			
			SevenDaySubscriber sds = new SevenDaySubscriber();
                        
			sds.setDireccion(direccion);
			sds.setSubs(Subscription.SEVENDAYSUBSCRIBER);
			System.out.println( sds.toString() );
			
			break;
			
		case 2 :
			
			WeekdaySubscriber wds = new WeekdaySubscriber();
			wds.setDireccion(direccion);
			wds.setSub(Subscription.WEEKDAYSUBSCRIBER);
			System.out.println( wds.toString() );
			
			break;
			
		case 3 : 
			
			WeekendSubscriber wkes = new WeekendSubscriber();
			wkes.setDireccion(direccion);
			wkes.setSub(Subscription.WEEKENDSUBSCRIBER);
			System.out.println( wkes.toString() );
			
			break;
			
			default : throw new SubscriptorsException( " \n \t El Tipo de Servicio Igresado no es Correcto. \n \t El Servicio no Coincide con el Servicio Solicitado!. \n " );
		
		
		}
                
                //StoryDemo
                Story[] stories = new Story[6];
		stories[0] = new Novel("Novela 1", "Autor 1", 132);
		stories[1] = new Novel("Novela 2 ", "Ramirez", 92);
		stories[2] = new Novella("Novella 1", "Autor 2", 82);
		stories[3] = new Novella("Novella 2", "Sanchez", 101);
		stories[4] = new ShortStory("Historia Corta", "Autor 3", 43);
		stories[5] = new ShortStory("Historia Corta 2 ", "Velasquez", 68);
		
		for (int i = 0; i < stories.length; i++) {
			
			System.out.println( " \n Titulo del Libro : \t " + stories[i].getTitle() );
			System.out.println( " Nombre del Autor : \t " + stories[i].getAuthorName() );
			System.out.println( " Numero de Paginas del Libro : \t " + stories[i].getPagesNumber() );
			System.out.println(  stories[i].getMessage() );
			
		}
                
                //UseInsurance
                System.out.println( " Tipos de Seguros : \n " );
		Health salud = new Health(null);
		salud.setInsurance(" Seguro de Salud");
		salud.setMonthCost(40.0);
		salud.display();
		
		Life vida = new Life(null);
		vida.setInsurance(" Seguro de Vida ");
		vida.setMonthCost(86.00);
		vida.display();
                
                //UseGeometric
                GeometricFigure[] figuras = new GeometricFigure[2];
		figuras[0] = new Square(10.0, 4.0, Figure.CUADRADO);
		figuras[1] = new Triangle(4.0, 10.0, Figure.TRIANGULO);
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println( " La Figura es : \t " + figuras[i].getType() );
			System.out.println( " El Area de la Figura es : \t " + figuras[i].calculateArea() + " U2 " );
		}

                //UsePlayer
                Child niño = new Child();
		niño.play();
		Musician musico = new Musician();
		musico.play();
		Actor actor = new Actor();
		actor.play();
                
                //UseStudent
              /* ArrayList<Student> estudiantes = new ArrayList<>();
		estudiantes.add( new FullTime("Luis", true) );
		estudiantes.add( new PartTime("Miguel", false) );
		estudiantes.add( new FullTime("Ferreira", false) );
		estudiantes.add( new PartTime("Felipe", true) );
		
		for( Student s : estudiantes ) {
			
			System.out.println( " \n Nombre del Estudiante : \t " + s.getName() );
			System.out.println( " Tutorias Completas? \t \t " + s.getStatus() );
			System.out.println( " Honorarios por Tutorias : \t $" + s.costTuition() + ".00 " );
			
		}*/
                
                //CreateBuildings
		
		Building alto = new Building(25, 850.0);
		House chico = new House(3, 45.0, 5, 3);
		School mediano = new School(3, 120.0, 15, Grades.JUNIOR);

		System.out.println( " \n El Numero de Pizos del Edificio Son : \t " + alto.getnPisos() );
		System.out.println( " La Medida en Pies Cuadrados es : \t " + alto.getPiesCuadrados() ) ;
		
		System.out.println( " \n El Numero de Pizos de la Casa es : \t " + chico.getnPisos() );
		System.out.println( " La Medida en Pies Cuadrados es : \t " + chico.getPiesCuadrados() ) ;
		System.out.println( " El Numero de Habitaciones ( Dormitorios ) es : \t " + chico.getNumeroDormitorios() );
		System.out.println( " El Numero de Baños es : \t " + chico.getNumeroBaños() );
		
		System.out.println( " \n El Numero de Pizos de la Escuela es : \t " + mediano.getnPisos() );
		System.out.println( " La Medida en Pies Cuadrados es : \t " + mediano.getPiesCuadrados() ) ;
		System.out.println( " El Numero de Salones ( Aulas ) es : \t " + mediano.getClassRooms() );
		System.out.println( " El Grado de Estudios de la Escuela es : \t " + mediano.getGrades() );
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}

}
    

