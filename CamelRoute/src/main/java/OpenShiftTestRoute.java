import org.apache.camel.builder.RouteBuilder;


public class OpenShiftTestRoute extends RouteBuilder {

//<editor-fold desc="Full Route Description">
    //Define Finals Here

//<editor-fold desc="Direct Log Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Route Start Points">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes By ID">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Specific Route Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes Walkthrough">

   
      /*
      Route Walkthrough
      Purpose
      Tools
      Speficis
      Error Handling
     */
    //</editor-fold>

//</editor-fold>


    @Override
    public void configure() throws Exception {

        from("timer:start?period=10s").setBody(simple("Test")).to("log:second");

    }


}