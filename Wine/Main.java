/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP_Project.Wine;
import java.time.LocalDateTime;
import java.util.*;
/**
 *
 * @author VNTK_White
 */
public class Main {

    public static void main(String[] args) {
        brands = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        List<Wine> wines = new ArrayList<>();
        List<WineBottle> wineBottles = new ArrayList<>();
        List<Brand> Brands = new ArrayList<>();
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Manage Wines");
            System.out.println("2. Manage Wine Bottles");
            System.out.println("3. Manage Brands");
            System.out.println("4. Exit");
            System.out.print("Option: ");
            int option = 0;

            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // clear the input buffer
                continue;
            }
            switch (option) {
                case 1 -> manageWines(scanner, wines);
                case 2 -> manageWineBottles(scanner, wineBottles);
                case 3 -> manageBrands(scanner, Brands);
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option. Please select again.");
            }
        }
    }
     private static void manageWines(Scanner scanner, List<Wine> wines) {
         while (true) {
        System.out.println("Select an option:");
        System.out.println("1. Add Wine");
        System.out.println("2. Delete Wine");
        System.out.println("3. Find Wine");
        System.out.println("4. Display Wines");
        System.out.println("5. Update Wine");
        System.out.println("6. Back");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                Wine wine = new Wine();
                System.out.println("Enter wine name:");
                wine.setName(scanner.next());
                System.out.println("Enter wine type:");
                wine.setType(scanner.next());
                System.out.println("Enter vineyard name:");
                wine.setVineyardName(scanner.next());
                System.out.println("Enter vintage:");
                wine.setVintage(scanner.next());
                System.out.println("Enter country:");
                wine.setCountry(scanner.next());
                System.out.println("Enter price:");
                wine.setPrice(scanner.nextDouble());
                wines.add(wine);
                System.out.println("Wine added successfully.");
                 }
            case 2 -> {
                System.out.println("Enter wine ID to delete:");
                int deleteId = scanner.nextInt();
                boolean deleted = false;
                for (Wine w : wines) {
                    if (w.getId() == deleteId) {
                        wines.remove(w);
                        deleted = true;
                        break;
                    }
                }
                if (deleted) {
                    System.out.println("Wine with ID " + deleteId + " deleted successfully.");
                } else {
                    System.out.println("Wine with ID " + deleteId + " not found.");
                }}
            case 3 -> {
                System.out.println("Enter wine ID to find:");
                int findId = scanner.nextInt();
                boolean found = false;
                for (Wine w : wines) {
                    if (w.getId() == findId) {
                        System.out.println("Wine found: " + w.getName());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Wine with ID " + findId + " not found.");
                }}
            case 4 -> {
                System.out.println("All Wines:");
                for (Wine w : wines) {
                    System.out.println("ID: " + w.getId() + ", Name: " + w.getName() +
                            ", Type: " + w.getType() + ", Vineyard: " + w.getVineyardName() +
                            ", Vintage: " + w.getVintage() + ", Country: " + w.getCountry() +
                            ", Price: " + w.getPrice());
                }}
            case 5 -> {
                System.out.println("Enter wine ID to update:");
                int updateId = scanner.nextInt();
                boolean updated = false;
                for (Wine w : wines) {
                    if (w.getId() == updateId) {
                        System.out.println("Enter new wine name:");
                        w.setName(scanner.next());
                        System.out.println("Enter new wine type:");
                        w.setType(scanner.next());
                        System.out.println("Enter new vineyard name:");
                        w.setVineyardName(scanner.next());
                        System.out.println("Enter new vintage:");
                        w.setVintage(scanner.next());
                        System.out.println("Enter new country:");
                        w.setCountry(scanner.next());
                        System.out.println("Enter new price:");
                        w.setPrice(scanner.nextDouble());
                        System.out.println("Wine updated successfully.");
                        updated = true;
                        break;
                    }
                }
                if (!updated) {
                    System.out.println("Wine with ID "+ updateId + " updated successfully.");
                } else {
                    System.out.println("Wine with ID " + updateId + " not found.");
                }}
            case 6 -> {
                return;
                 }
                default -> System.out.println("Invalid option. Please select again.");
            }
        }
     }
     
     private static void manageWineBottles(Scanner scanner, List<WineBottle> wineBottles) {    
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the number corresponding to the action you want to take:");
            System.out.println("1. Add a new wine bottle");
            System.out.println("2. Update an existing wine bottle");
            System.out.println("3. Remove a wine bottle");
            System.out.println("4. View all wine bottles");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    WineBottle wineBottle = new WineBottle();

                    System.out.println("Enter the producer name of the wine bottle:");
                    wineBottle.setProducerName(scanner.nextLine());

                    System.out.println("Enter the quantity of the wine bottles:");
                    wineBottle.setQuantity(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Enter the volume of the wine bottle:");
                    wineBottle.setVolume(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("Enter the code of the wine bottle:");
                    wineBottle.setBottleCode(scanner.nextLine());

                    System.out.println("Enter the number of grape varieties:");
                    int numGrapes = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numGrapes; i++) {
                        System.out.println("Enter grape variety #" + (i + 1) + ":");
                        wineBottle.addGrapeVariety(scanner.nextLine());
                        wineBottles.add(wineBottle);
                        System.out.println("Wine bottle added successfully.");
                        }

                }
                    case 2 -> {
                        System.out.println("Enter the ID of the wine bottle to update:");
                        int idToUpdate = scanner.nextInt();
                        scanner.nextLine();

                        WineBottle wineBottleToUpdate = wineBottles.stream()
                                .filter(w -> w.getId() == idToUpdate)
                                .findFirst()
                                .orElse(null);

                        if (wineBottleToUpdate == null) {
                            System.out.println("Wine bottle not found.");
                        } else {
                            System.out.println("Enter the new producer name of the wine bottle:");
                            wineBottleToUpdate.setProducerName(scanner.nextLine());

                            System.out.println("Enter the new quantity of the wine bottles:");
                            wineBottleToUpdate.setQuantity(scanner.nextInt());
                            scanner.nextLine();

                            System.out.println("Enter the new volume of the wine bottle:");
                            wineBottleToUpdate.setVolume(scanner.nextDouble());
                            scanner.nextLine();

                            System.out.println("Enter the new code of the wine bottle:");
                            wineBottleToUpdate.setBottleCode(scanner.nextLine());

                            System.out.println("Enter the new number of grape varieties:");
                            int newNumGrapes = scanner.nextInt();
                            scanner.nextLine();

                            List<String> newGrapes = new ArrayList<>();
                            for (int i = 0; i < newNumGrapes; i++) {
                                System.out.println("Enter new grape variety #" + (i + 1) + ":");
                                newGrapes.add(scanner.nextLine());
                            }
                            wineBottleToUpdate.setGrapeVarieties(newGrapes);
                            System.out.println("Wine bottle updated successfully.");
    }
                }
                case 3 -> {
                    System.out.println("Enter the ID of the wine bottle to remove:");
                    int idToRemove = scanner.nextInt();
                    scanner.nextLine();

                    boolean removed = wineBottles.removeIf(w -> w.getId() == idToRemove);
                    System.out.println(removed ? "Wine bottle removed successfully." : "Wine bottle not found.");
                }

                case 4 -> {
                    if (wineBottles.isEmpty()) {
                        System.out.println("There are no wine bottles.");
                    } else {
                        System.out.println("List of wine bottles:");
                        wineBottles.forEach(wb -> {
                            System.out.printf("Producer name: %s | Quantity: %d | Volume: %.2f | Bottle code: %s | Grape varieties: %s\n",
                                    wb.getProducerName(), wb.getQuantity(), wb.getVolume(), wb.getBottleCode(), wb.getGrapeVarieties());
                        });
                    }
                }
                case 5 -> {
                    exit = true;
                    System.out.println("Exiting wine bottle management system.");
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");

                }
            }   
        }
     
    private static void manageBrands(Scanner scanner, List<Brand> brands) {
    int choice = 0;
    while (choice != 5) {
        System.out.println("Choose an option:");
        System.out.println("1. View all brands");
        System.out.println("2. Add a new brand");
        System.out.println("3. Delete a brand");
        System.out.println("4. Update a brand");
        System.out.println("5. Exit");
        System.out.print("Option: ");
        choice = scanner.nextInt();

         switch (choice) {
            case 1 -> {
                for (Brand brand : brands) {
                    System.out.println(brand.getCode() + " - " + brand.getName());
                }
            }
            case 2 -> {
                Brand newBrand = new Brand();
                System.out.println("Enter brand code:");
                newBrand.setCode(scanner.next());
                System.out.println("Enter brand name:");
                newBrand.setName(scanner.next());
                brands.add(newBrand);
                System.out.println("Brand added successfully");
            }
            case 3 -> {
                System.out.println("Enter brand code to delete:");
                String codeToDelete = scanner.next();
                boolean brandDeleted = false;
                for (int i = 0; i < brands.size(); i++) {
                    Brand brand = brands.get(i);
                    if (brand.getCode().equals(codeToDelete)) {
                        brands.remove(i);
                        brandDeleted = true;
                        break;
                    }
                }
                if (brandDeleted) {
                    System.out.println("Brand deleted successfully");
                } else {
                    System.out.println("Brand not found");
                }
            }
            case 4 -> {
                System.out.println("Enter brand code to update:");
                String codeToUpdate = scanner.next();
                boolean brandUpdated = false;
                for (Brand brand : brands) {
                    if (brand.getCode().equals(codeToUpdate)) {
                        System.out.println("Enter new brand name:");
                        String newName = scanner.next();
                        brand.setName(newName);
                        brand.setUpdated(LocalDateTime.now());
                        brandUpdated = true;
                        break;
                    }
                }
                if (brandUpdated) {
                    System.out.println("Brand updated successfully");
                } else {
                    System.out.println("Brand not found");
                }
            }
            case 5 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice");
        }
    }
}
}
