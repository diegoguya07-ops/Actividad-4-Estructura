public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        int[] secuencia = {
            7, 48, 20, 8, 47, 56, 78, 99, 34, 89, 10, 96,
            36, 58, 6, 45, 35, 55, 88, 82, 39, 41, 29
        };

        for (int i = 0; i < secuencia.length; i++) {
            arbol.insertar(secuencia[i]);
        }

        System.out.println("ARBOL INICIAL");
        System.out.println("INORDEN:" + arbol.inorden());
        System.out.println("PREORDEN:" + arbol.preorden());
        System.out.println("POSTORDEN:" + arbol.postorden());

        System.out.println("BUSCAR 47:" + arbol.buscar(47));
        System.out.println("BUSCAR 100:" + arbol.buscar(100));

        System.out.println("CLASE 7:" + arbol.claseNodo(7));
        System.out.println("CLASE 6:" + arbol.claseNodo(6));
        System.out.println("CLASE 20:" + arbol.claseNodo(20));

        System.out.println("ELIMINAR 6:" + arbol.eliminar(6));
        System.out.println("PREORDEN:" + arbol.preorden());

        System.out.println("ELIMINAR 7:" + arbol.eliminar(7));
        System.out.println("PREORDEN:" + arbol.preorden());

        System.out.println("ELIMINAR 48:" + arbol.eliminar(48));
        System.out.println("INORDEN:" + arbol.inorden());
        System.out.println("PREORDEN:" + arbol.preorden());
    }
}
