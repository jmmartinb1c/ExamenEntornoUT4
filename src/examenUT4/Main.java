/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;


public class Main {

    public static void main(String[] args) {
        //Para cambiar el nombre de la variable seleccionamos el nombre
    	//de la variable, le damos con el boton derecho -> Refactor -> Rename
    	CCuenta cuenta1;
        double saldoActual;
        float cantidad = 0;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, cantidad);
    }

    /*
     * Seleccionamos el código que realizaba las operaciones de la cuenta
     * como retirar e ingresar, le damos con el boton derecho -> Refactor ->
     * Extract Method y le ponemos el nombre operativa_cuenta
     */
	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
