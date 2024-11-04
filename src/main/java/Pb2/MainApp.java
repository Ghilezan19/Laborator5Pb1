package Pb2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Clasa MainApp gestioneaza citirea, afisarea și calcularea
 * necesarului de placi de pal pentru piesele
 * de mobilier din fisierul JSON.
 */
public class MainApp
{
    /**
     * Citește datele despre piesele de mobilier dintr-un fișier JSON
     * si le returneaza ca o lista de obiecte Mobilier.
     *
     * @param filePath calea catre fișierul JSON
     * @return lista de obiecte Mobilier
     */
    public static List<Mobilier> citireMobilier(String filePath)
    {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            return mapper.readValue(new File(filePath), new TypeReference<List<Mobilier>>() {});
        } catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Afiseaza informatiile despre piesele de mobilier și placile din care sunt facute
     * @param mobilier lista de obiecte Mobilier de afisat
     */
    public static void afisareMobilier(List<Mobilier> mobilier)
    {
        for (Mobilier mob : mobilier)
        {
            System.out.println("Mobilier: " + mob.getNume());
            for (Placa placa : mob.getPlaci())
            {
                System.out.println("  " + placa);
            }
        }
    }

    /**
     * Afiseaza informatiile despre placile care compun o anume piesa.
     * @param mobilier obiectul Mobilier pentru care se vor afisa placile
     */
    public static void afisarePlaciMobilier(Mobilier mobilier)
    {
        System.out.println("Mobilier: " + mobilier.getNume());
        for (Placa placa : mobilier.getPlaci())
        {
            System.out.println("  " + placa);
        }
    }
    /**
     * Calculeaza necesarul de placi de pal pentru o piesa de mobilier.
     * @param mobilier obiectul Mobilier pentru care se calculeaza necesarul
     * @return numarul de coli de pal necesare
     */
    public static int calculeazaNecesarPal(Mobilier mobilier)
    {
        int arieTotala = 0;
        for (Placa placa : mobilier.getPlaci())
        {
            int ariePlaca = placa.getLungime() * placa.getLatime() * placa.getnr_bucati();
            arieTotala += ariePlaca;
        }
        int arieCoala = 2800 * 2070;
        return (int) Math.ceil((double) arieTotala / arieCoala);
    }
    /**
     * Metoda unde se citesc datele si le afiseaza
     * @param args argumentele din linia de comanda
     */
    public static void main(String[] args)
    {
        String filePath = "C:\\Users\\ghile\\IdeaProjects\\Laborator5Pb2\\src\\main\\resources\\mobilier.json";  // Asigură-te că fișierul JSON este în aceeași locație sau pune calea completă
        List<Mobilier> mobilier = citireMobilier(filePath);
        if (mobilier != null)
        {
            System.out.println("Afisare mobilier si placile din care e compus:");
            afisareMobilier(mobilier);
            System.out.println("\nAfisare detalii pentru fiecare piesa de mobilier:");
            for (Mobilier mob : mobilier)
            {
                afisarePlaciMobilier(mob);
            }
            System.out.println("\nCalculul necesarului de placi de pal:");
            for (Mobilier mob : mobilier)
            {
                System.out.println("Mobilier: " + mob.getNume() + " - placi necesare: " + calculeazaNecesarPal(mob));
            }
        } else
        {
            System.out.println("Eroare la citirea fisierului JSON.");
        }
    }
}
