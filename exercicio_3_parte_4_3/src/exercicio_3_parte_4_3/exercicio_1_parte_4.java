package exercicio_3_parte_4_3;

/**
 *
 * @author pedro.dantas
 */
public class exercicio_1_parte_4
{
    public static void main(String[] args)
    {
        PenDrive pendrive = new PenDrive();
        PenDrive pendrive2 = new PenDrive();
       
        pendrive.entrada();
        pendrive.imprimir();
        
        pendrive2.cadastrar("SanDisk", 16, 2.0, 2.0, 2.0, 3.0, 1.000);
        pendrive2.imprimir();
    }   
}
