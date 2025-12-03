package dev.lanny.ghost_busters.view;

import java.util.Scanner;

import dev.lanny.ghost_busters.controller.HunterController;

public class DeleteGhostView {

    public static void deleteGhost(HunterController controller, Scanner scanner) {
        System.out.println("============================================");
        System.out.println("         Eliminar Fantasma Capturado        ");
        System.out.println("============================================");

        System.out.print("Ingrese el ID del fantasma a liberar: ");
        int id;

        try {
            id = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("❌ ID inválido. Debe ser un número entero.");
            return;
        }

        boolean deleted = controller.freeGhost(id);

        if (deleted) {
            System.out.println("✅ Fantasma liberado exitosamente.");
        } else {
            System.out.println("❌ No existe ningún fantasma con ese ID.");
        }
    }
}
