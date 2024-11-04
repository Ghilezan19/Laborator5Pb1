package Pb2;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/**
 * Clasa Placa reprezinta o placa de pal folosita pentru piesele de mobilier.
 * Aceasta contine informatii despre dimensiunile placii, orientarea,
 * canturile si numarul de bucati necesare.
 */
public class Placa
{
    private String descriere;
    private int lungime;
    private int latime;
    private String orientare;
    private boolean[] canturi;
    private int nr_bucati;
    /**
     * Constructorul implicit al clasei Placa.
     */
    public Placa()
    {
    }
    /**
     * Constructorul clasei Placa cu parametrii specifici.
     * @param descriere Descrierea placii
     * @param lungime Lungimea placii
     * @param latime Latimea placii
     * @param orientare Orientarea placii
     * @param canturi Array de boolean ce reprezinta canturile placii
     * @param nr_bucati Numarul de bucati din placa
     */
    public Placa(String descriere, int lungime, int latime, String orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    /**
     * Gettere,Settere
     */
    public String getDescriere()
    {
        return descriere;
    }
    public void setDescriere(String descriere)
    {
        this.descriere = descriere;
    }
    public int getLungime()
    {
        return lungime;
    }
    public void setLungime(int lungime)
    {
        this.lungime = lungime;
    }
    public int getLatime()
    {
        return latime;
    }
    public void setLatime(int latime)
    {
        this.latime = latime;
    }
    public String getOrientare()
    {
        return orientare;
    }
    public void setOrientare(String orientare)
    {
        this.orientare = orientare;
    }
    public boolean[] getCanturi()
    {
        return canturi;
    }
    public void setCanturi(boolean[] canturi)
    {
        this.canturi = canturi;
    }
    public int getnr_bucati() {
        return nr_bucati;
    }
    public void setnr_bucati(int nr_bucati)
    {
        this.nr_bucati = nr_bucati;
    }

    /**
     *  Returneaza  string a obiectului Placa.
     *  @return stringul care reprezinta obiectul Placa
     */
    @Override
    public String toString()
    {
        return "Placa{" + "descriere='" + descriere + '\'' + ", lungime=" + lungime + ", latime=" + latime + ", orientare='" + orientare + '\'' + ", canturi=" + java.util.Arrays.toString(canturi) + ", nr_bucati=" + nr_bucati + '}';
    }
}
