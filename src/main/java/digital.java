import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;


public class digital {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.edge.driver", "D:\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://creditodigital.hexasolutions.co/aliado/GAHm2HmWKxfYsY5PSjG5hw%3D%3D");
        driver.manage().window().maximize();
        Thread.sleep(25000);


        //Metodo de autenticacion
        WebElement adjunto = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-desembolso-digital/div/div/div/div[2]/div[2]/div"));
        JavascriptExecutor a = (JavascriptExecutor) driver;
        a.executeScript("arguments[0].click()",adjunto);
        Thread.sleep(2500);

        //Boton crear solicitud//
        WebElement nuevasoli = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-desembolso-digital/div/div/div/div[2]/div[3]/button"));
        nuevasoli.sendKeys(ENTER);
        Thread.sleep(10000);


        //Seleccionar canal
        WebElement selectcanal = driver.findElement(By.xpath("//*[@id=\"DBTIPD\"]/div"));
        JavascriptExecutor g = (JavascriptExecutor) driver;
        g.executeScript("arguments[0].click()",selectcanal);
        driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/p-dropdownitem")).click();
        Thread.sleep(1000);


        //Boton crear una nueva solicitud//
        WebElement ps1 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor c = (JavascriptExecutor) driver;
        c.executeScript("arguments[0].click()",ps1);
        Thread.sleep(2000);


        //Llamado de la cedula
        WebElement cedula = driver.findElement(By.id("numero_documento"));
        cedula.sendKeys("1098774933");
        Thread.sleep(2000);

        //Boton crear una nueva solicitud//
        WebElement ps2 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cl = (JavascriptExecutor) driver;
        cl.executeScript("arguments[0].click()",ps2);
        Thread.sleep(7000);

        WebElement nombre = driver.findElement(By.xpath("//*[@id=\"primerNombre\"]"));
        nombre.sendKeys("diego");
        Thread.sleep(2000);
        WebElement snombre = driver.findElement(By.id("segundoNombre"));
        snombre.sendKeys("Fernando");
        Thread.sleep(1000);

        WebElement ps3 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cl2 = (JavascriptExecutor) driver;
        cl2.executeScript("arguments[0].click()",ps3);
        Thread.sleep(1000);

        WebElement papellido = driver.findElement(By.id("primerApellido"));
        papellido.sendKeys("ramirez");
        Thread.sleep(1000);

        WebElement sapellido = driver.findElement(By.id("segundoApellido"));
        sapellido.sendKeys("ochoa");
        Thread.sleep(1000);

        WebElement ps4 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cl3 = (JavascriptExecutor) driver;
        cl3.executeScript("arguments[0].click()",ps4);
        Thread.sleep(1000);

        WebElement telefono = driver.findElement(By.id("telefono"));
        telefono.sendKeys("3144323068");
        Thread.sleep(1000);

        WebElement contel = driver.findElement(By.id("confirmar_telefono"));
        contel.sendKeys("3144323068");
        Thread.sleep(1000);

        WebElement ps5 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cl5 = (JavascriptExecutor) driver;
        cl5.executeScript("arguments[0].click()",ps5);
        Thread.sleep(1000);

        //////////////////////////

        WebElement correo = driver.findElement(By.xpath("//*[@id=\"correo\"]"));
        correo.sendKeys("daniel.nieto@hexasolutions.co");
        Thread.sleep(1000);

        WebElement concorreo = driver.findElement(By.xpath("//*[@id=\"confirmar_correo\"]"));
        concorreo.sendKeys("daniel.nieto@hexasolutions.co");
        Thread.sleep(1000);

        WebElement ps6 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cl6 = (JavascriptExecutor) driver;
        cl6.executeScript("arguments[0].click()",ps6);
        Thread.sleep(3000);


        //selecionar ocupacion

        WebElement ocupacion = driver.findElement(By.xpath("//*[@id=\"TIPOCU\"]/div"));
        JavascriptExecutor o = (JavascriptExecutor) driver;
        o.executeScript("arguments[0].click()",ocupacion);
        driver.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/p-dropdownitem[1]/li")).click();
        Thread.sleep(1000);

      WebElement ps7 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
       JavascriptExecutor cl7 = (JavascriptExecutor) driver;
       cl7.executeScript("arguments[0].click()",ps7);
       Thread.sleep(15000);

       ///

        WebElement empresa = driver.findElement(By.xpath("//*[@id=\"UFAEMP\"]"));
        empresa.sendKeys("hexasolutions");
        Thread.sleep(3000);

        WebElement psb = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clb = (JavascriptExecutor) driver;
        clb.executeScript("arguments[0].click()",psb);
        Thread.sleep(2000);

        ////////

        WebElement antiguedad = driver.findElement(By.xpath("//*[@id=\"UFANTE\"]"));
        antiguedad.sendKeys("36");
        Thread.sleep(1000);

        WebElement antig = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor ant = (JavascriptExecutor) driver;
        ant.executeScript("arguments[0].click()",antig);
        Thread.sleep(2000);

        ////////
        WebElement valor_ingreso = driver.findElement(By.xpath("//*[@id=\"UFINI\"]"));
        valor_ingreso.sendKeys("5,000.000");
        Thread.sleep(1000);

        WebElement pst = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clt = (JavascriptExecutor) driver;
        clt.executeScript("arguments[0].click()",pst);
        Thread.sleep(1000);

        ///////

        WebElement valor_gastos = driver.findElement(By.xpath("//*[@id=\"UFGAS\"]"));
        valor_gastos.sendKeys("700000");
        Thread.sleep(1000);

        WebElement psd = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cld = (JavascriptExecutor) driver;
        cld.executeScript("arguments[0].click()",psd);
        Thread.sleep(2000);

        //////////

        WebElement suma_bienes = driver.findElement(By.xpath("//*[@id=\"UFACT\"]"));
        suma_bienes.sendKeys("85000000");
        Thread.sleep(1000);

        WebElement pse = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cle = (JavascriptExecutor) driver;
        cle.executeScript("arguments[0].click()",pse);
        Thread.sleep(2000);

        //////////

        WebElement luegarciud = driver.findElement(By.xpath("//*[@id=\"ciudad\"]"));
        luegarciud.sendKeys("Bucaramanga");
        Thread.sleep(900);
        JavascriptExecutor lc = (JavascriptExecutor) driver;
        lc.executeScript("arguments[0].click()",luegarciud);
        driver.findElement(By.xpath("//*[@id=\"pr_id_3_list\"]/li")).click();
        Thread.sleep(1000);


        WebElement psf = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clf = (JavascriptExecutor) driver;
        clf.executeScript("arguments[0].click()",psf);
        Thread.sleep(4000);

        ////////

        // selecionar fecha expedicion

        WebElement fecexp = driver.findElement(By.xpath("//*[@id=\"CPLEXP\"]"));
        JavascriptExecutor f = (JavascriptExecutor) driver;
        f.executeScript("arguments[0].click()",fecexp);
        driver.findElement(By.xpath("//*[@id=\"2013\"]")).click();
        driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal-fechas/div/div/div[2]/div[2]/div/div/div[9]")).click();
        driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal-fechas/div/div/div[2]/div[2]/div[9]/table/tbody/tr[6]/td[2]")).click();
        Thread.sleep(1000);

        WebElement psl = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor cll = (JavascriptExecutor) driver;
        cll.executeScript("arguments[0].click()",psl);
        Thread.sleep(2000);

        ///////////////////////////

        // selecionar fecha nacimiento

        WebElement fecnac = driver.findElement(By.xpath("//*[@id=\"CPLNAC\"]"));
        JavascriptExecutor n = (JavascriptExecutor) driver;
        n.executeScript("arguments[0].click()",fecnac);
        driver.findElement(By.xpath("//*[@id=\"1995\"]")).click();
        driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal-fechas/div/div/div[2]/div[2]/div/div/div[9]")).click();
        driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal-fechas/div/div/div[2]/div[2]/div[9]/table/tbody/tr[4]/td[3]")).click();
        Thread.sleep(1000);

        WebElement psh = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clh = (JavascriptExecutor) driver;
        clh.executeScript("arguments[0].click()",psh);
        Thread.sleep(2000);

        ///////////

        WebElement luegarexpedi = driver.findElement(By.xpath("//*[@id=\"ciudad\"]"));
        luegarexpedi.sendKeys("Bucaramanga");
        Thread.sleep(900);
        JavascriptExecutor lg = (JavascriptExecutor) driver;
        lg.executeScript("arguments[0].click()",luegarexpedi);
        driver.findElement(By.xpath("//*[@id=\"pr_id_4_list\"]/li")).click();
        Thread.sleep(1000);

        WebElement psg = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clg = (JavascriptExecutor) driver;
        clg.executeScript("arguments[0].click()",psg);
        Thread.sleep(2000);


       // genero
        WebElement genero = driver.findElement(By.xpath("//*[@id=\"CPLGEN\"]/div"));
        JavascriptExecutor h = (JavascriptExecutor) driver;
        h.executeScript("arguments[0].click()",genero);
        driver.findElement(By.xpath("//*[@id=\"pr_id_5_list\"]/p-dropdownitem[2]/li")).click();
        Thread.sleep(1000);

        WebElement psk = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clk = (JavascriptExecutor) driver;
        clk.executeScript("arguments[0].click()",psk);
        Thread.sleep(2000);


        // estadocivil
        WebElement estcivil = driver.findElement(By.xpath("//*[@id=\"UFESTC\"]/div"));
        JavascriptExecutor ci = (JavascriptExecutor) driver;
        ci.executeScript("arguments[0].click()",estcivil);
        driver.findElement(By.xpath("//*[@id=\"pr_id_6_list\"]/p-dropdownitem[1]")).click();
        Thread.sleep(1000);

        WebElement psq = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clq = (JavascriptExecutor) driver;
        clq.executeScript("arguments[0].click()",psq);
        Thread.sleep(2000);


        // educacion
        WebElement educacion = driver.findElement(By.xpath("//*[@id=\"UFEDUC\"]/div"));
        JavascriptExecutor es = (JavascriptExecutor) driver;
        es.executeScript("arguments[0].click()",educacion);
        driver.findElement(By.xpath("//*[@id=\"pr_id_7_list\"]/p-dropdownitem[6]/li")).click();
        Thread.sleep(1000);

        WebElement psw = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clw = (JavascriptExecutor) driver;
        clw.executeScript("arguments[0].click()",psw);
        Thread.sleep(2000);


        /////////////////////////
        //componente  direcion
        /////////////////////////


        // ciudad
        WebElement ciubarrio = driver.findElement(By.xpath("//*[@id=\"ciudad\"]"));
        ciubarrio.sendKeys("Bucaramanga");
        Thread.sleep(900);
        JavascriptExecutor cbr = (JavascriptExecutor) driver;
        cbr.executeScript("arguments[0].click()",ciubarrio);
        driver.findElement(By.xpath("//*[@id=\"pr_id_8_list\"]/li")).click();
        Thread.sleep(1000);

        WebElement psr = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor clr = (JavascriptExecutor) driver;
        clr.executeScript("arguments[0].click()",psr);
        Thread.sleep(2000);


        //barrio

        WebElement barrio = driver.findElement(By.xpath("//*[@id=\"barrio_vereda\"]/div"));
        JavascriptExecutor br = (JavascriptExecutor) driver;
        br.executeScript("arguments[0].click()",barrio);
        driver.findElement(By.xpath("//*[@id=\"pr_id_12_list\"]/cdk-virtual-scroll-viewport/div[1]/p-dropdownitem[12]/li")).click();
        Thread.sleep(1000);

        WebElement crb = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor rt = (JavascriptExecutor) driver;
        rt.executeScript("arguments[0].click()",crb);
        Thread.sleep(2000);



        WebElement nomenclatura = driver.findElement(By.xpath("//*[@id=\"momenclatura\"]/div"));
        JavascriptExecutor no = (JavascriptExecutor) driver;
        no.executeScript("arguments[0].click()",nomenclatura);
        driver.findElement(By.xpath("//*[@id=\"pr_id_10_list\"]/p-dropdownitem[4]/li")).click();
        Thread.sleep(1000);

        WebElement principal = driver.findElement(By.xpath("//*[@id=\"principal\"]"));
        principal.sendKeys("5bn");
        Thread.sleep(1000);

        WebElement adicional = driver.findElement(By.xpath("//*[@id=\"adicional\"]"));
        adicional.sendKeys("1w");
        Thread.sleep(1000);

        WebElement complementaria = driver.findElement(By.xpath("//*[@id=\"adicional_complementaria\"]"));
        complementaria.sendKeys("34");
        Thread.sleep(1000);

        //Boton crear solicitud//
        WebElement resi = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[66]/app-componentes-direccion/div/div/div[2]/div/div[9]/button"));
        resi.sendKeys(ENTER);
        Thread.sleep(10000);

        //////////////////////////
        // vivienda donde vive //
        ////////////////////////


        WebElement t_vivienda = driver.findElement(By.xpath("//*[@id=\"idTipoVivienda\"]/div"));
        JavascriptExecutor vi = (JavascriptExecutor) driver;
        vi.executeScript("arguments[0].click()",t_vivienda);
        driver.findElement(By.xpath("//*[@id=\"pr_id_13_list\"]/p-dropdownitem[1]/li")).click();
        Thread.sleep(1000);

        WebElement tipo = driver.findElement(By.xpath("//*[@id=\"idClaseVivienda\"]/div"));
        JavascriptExecutor ti = (JavascriptExecutor) driver;
        ti.executeScript("arguments[0].click()",tipo);
        driver.findElement(By.xpath("//*[@id=\"pr_id_14_list\"]/p-dropdownitem[1]/li")).click();
        Thread.sleep(1000);

        WebElement estrato = driver.findElement(By.xpath("//*[@id=\"estrato\"]/div"));
        JavascriptExecutor et = (JavascriptExecutor) driver;
        et.executeScript("arguments[0].click()",estrato);
        driver.findElement(By.xpath("//*[@id=\"pr_id_15_list\"]/p-dropdownitem[3]/li")).click();
        Thread.sleep(1000);

        WebElement cuantosmeses = driver.findElement(By.xpath("//*[@id=\"cuantos_meses\"]"));
        cuantosmeses.sendKeys("22");
        Thread.sleep(1000);

        //Boton crear solicitud//
        WebElement tipov = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[68]/app-componentes-clases-viviendas/div/div/div[3]/button"));
        resi.sendKeys(ENTER);
        Thread.sleep(10000);


        ////////////////
        // destino
        ///////////////

        WebElement destino = driver.findElement(By.xpath("//*[@id=\"SEGDES\"]/div"));
        JavascriptExecutor de = (JavascriptExecutor) driver;
        de.executeScript("arguments[0].click()",destino);
        driver.findElement(By.xpath("//*[@id=\"pr_id_16_list\"]/p-dropdownitem/li")).click();
        Thread.sleep(1000);

        WebElement ps9 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor d = (JavascriptExecutor) driver;
        d.executeScript("arguments[0].click()",ps9);
        Thread.sleep(5000);



        ////////////////////
        //
        ///////////////////

        WebElement beneficiarios = driver.findElement(By.xpath("//*[@id=\"BENTIP\"]"));
        beneficiarios.sendKeys("daniel hernandez");
        Thread.sleep(1000);

        WebElement ps10 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor v = (JavascriptExecutor) driver;
        v.executeScript("arguments[0].click()",ps10);
        Thread.sleep(5000);

        //////////////////
        //
        /////////////////

        WebElement inmueble = driver.findElement(By.xpath("//*[@id=\"INMUEB\"]"));
        inmueble.sendKeys("lavadora");
        Thread.sleep(1000);

        WebElement ps12 = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div"));
        JavascriptExecutor in = (JavascriptExecutor) driver;
        in.executeScript("arguments[0].click()",ps12);
        Thread.sleep(5000);


        //modal

        WebElement emergente = driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal/div/div[3]/button"));
        Thread.sleep(2000);
        emergente.sendKeys(Keys.ENTER);




        /// segundo paso ///

        /////////////////////
       // oferta
       /////////////////////


        WebElement cuanto = driver.findElement(By.xpath("//*[@id=\"monto_solicitado\"]"));
        inmueble.sendKeys("3000000");
        Thread.sleep(1000);

        WebElement frecuencia = driver.findElement(By.xpath("//*[@id=\"frecuencia_pago\"]/div"));
        JavascriptExecutor fe = (JavascriptExecutor) driver;
        fe.executeScript("arguments[0].click()",frecuencia);
        driver.findElement(By.xpath("//*[@id=\"pr_id_17_list\"]/p-dropdownitem/li")).click();
        Thread.sleep(1000);

        WebElement cuotas = driver.findElement(By.xpath("//*[@id=\"numero_cuotas\"]/div"));
        JavascriptExecutor cu = (JavascriptExecutor) driver;
        cu.executeScript("arguments[0].click()",cuotas);
        driver.findElement(By.xpath("//*[@id=\"pr_id_18_list\"]/p-dropdownitem[3]/li")).click();
        Thread.sleep(1000);

        WebElement cuantov = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[81]/app-componentes-oferta/form/div/div/div/div[4]/button"));
        cuantov.sendKeys(ENTER);
        Thread.sleep(10000);



        /////////////////////////////
        /// quiero el dinero   /////
        ///////////////////////////


        WebElement loquiero = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[82]/app-componente-oferta-aprobacion/div[3]/div/div/div[2]/div[1]/div/div[2]/div[4]/button"));
        loquiero.sendKeys(ENTER);
        Thread.sleep(10000);


        /////////////////////
        // aceptar oferta
        ////////////////////

        WebElement acepto = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[82]/app-componente-oferta-aprobacion/div[3]/div/div/div[2]/div[1]/div/div[2]/div[4]/div/button"));
        acepto.sendKeys(ENTER);
        Thread.sleep(70000);

        WebElement conf = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[82]/app-componente-oferta-aprobacion/div[3]/div/div/div[2]/div[1]/div/div[3]/div[3]/div/button"));
        conf.sendKeys(ENTER);
        Thread.sleep(10000);



        ///////////////
        //desembolso
        ///////////////

        WebElement dinero = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[84]/app-component-monetizacion/div/div/form/div/div[1]/div/div[3]/div"));
        JavascriptExecutor des = (JavascriptExecutor) driver;
        des.executeScript("arguments[0].click()",dinero);
        Thread.sleep(2500);

        WebElement desciudad = driver.findElement(By.xpath("//*[@id=\"ciudad\"]"));
        desciudad.sendKeys("Bucaramanga, Santander, Colombia");
        Thread.sleep(1000);

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[84]/app-component-monetizacion/div/div/form/div/div[4]/button"));
        cont.sendKeys(ENTER);
        Thread.sleep(50000);

        //////////////////
       // moneda
        /////////////////

        WebElement extr = driver.findElement(By.xpath("//*[@id=\"indicadorOperacionMonedaExtranjera\"]"));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click()",extr);
        Thread.sleep(2500);

        WebElement extra = driver.findElement(By.xpath("//*[@id=\"indicadorPEP\"]"));
        JavascriptExecutor ext = (JavascriptExecutor) driver;
        ext.executeScript("arguments[0].click()",extra);
        Thread.sleep(2500);

        WebElement extran = driver.findElement(By.xpath("//*[@id=\"indicadorRelacionPEP\"]"));
        JavascriptExecutor exr = (JavascriptExecutor) driver;
        exr.executeScript("arguments[0].click()",extran);
        Thread.sleep(2500);

        WebElement contextra = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[86]/app-componentes-preguntas-legales/form/div/div/div/div[4]/button"));
        contextra.sendKeys(ENTER);
        Thread.sleep(50000);


       // ventana modal
        WebElement emergente2 = driver.findElement(By.xpath("/html/body/p-dynamicdialog/div/div/div/app-componente-modal/div/div[3]/button"));
        Thread.sleep(2000);
        emergente.sendKeys(Keys.ENTER);


                /// tercer paso

        WebElement contextrat = driver.findElement(By.xpath("//*[@id=\"chatMain\"]/div/div[90]/app-componente-validacion-identidad/div/app-componente-verificar-camara/div/div/div[2]/div[2]/div/button"));
        contextrat.sendKeys(ENTER);
        Thread.sleep(50000);


        WebElement link = driver.findElement(By.xpath("//*[@id=\"card-GENLINKEMAIL\"]/div/div"));
        JavascriptExecutor ge = (JavascriptExecutor) driver;
        ge.executeScript("arguments[0].click()",link);
        Thread.sleep(2500);

        WebElement enlink = driver.findElement(By.xpath("//*[@id=\"idGenerarLink\"]/div/div[4]/button"));
        enlink.sendKeys(ENTER);
        Thread.sleep(50000);






    }
}

