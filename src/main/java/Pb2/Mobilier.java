package Pb2;
import java.util.List;
/**
 * Clasa Mobilier reprezinta o piesa de mobilier, care conține un nume
 * si o lista de placi de pal care o compun.
 */
public class Mobilier
{
    private String nume;
    private List<Placa> placi;
    /**
     * Constructor implicit pentru clasa Mobilier.
     */
    public Mobilier()
    {
    }
    /**
     * Constructor pentru clasa Mobilier, care initializează numele
     * si lista de placi.
     * @param nume numele piesei de mobilier
     * @param placi lista de placi care compun piesa de mobilier
     */
    public Mobilier(String nume, List<Placa> placi)
    {
        this.nume = nume;
        this.placi = placi;
    }
    /**
     * Obtine numele piesei de mobilier.
     * @return numele piesei de mobilier
     */
    public String getNume()
    {
        return nume;
    }
    /**
     * Obține lista de placi care compun piesa de mobilier.
     * @return lista de placi
     */
    public List<Placa> getPlaci()
    {
        return placi;
    }
    /**
     * Returneaza  string a obiectului Mobilier.
     * @return stringul care reprezinta obiectul Mobilier
     */
    @Override
    public String toString()
    {
        return "Mobilier{" + "nume='" + nume + '\'' + ", placi=" + placi + '}';
    }
}
