package DIseno;

public class Main {
    public static void main(String[] args) {
        Automatizacion auto1 = new Automatizacion("ScriptLogin", "Prueba");

        Automatizacion auto2 = new Automatizacion();
        auto2.setNombre("ReporteDiario");
        auto2.setTipo("RPA");

        System.out.println("Automatización 1: " + auto1.getNombre() + " - Tipo: " + auto1.getTipo());
        System.out.println("Automatización 2: " + auto2.getNombre() + " - Tipo: " + auto2.getTipo());

        System.out.println("Total de automatizaciones creadas: " + Automatizacion.getTotalCreados());
    }
}
