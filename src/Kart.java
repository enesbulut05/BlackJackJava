import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kart {

	private List<String> kartlar;

	public List<String> getKartlar() {
		return kartlar;
	}

	public void setKartlar(List<String> kartlar) {
		this.kartlar = kartlar;
	}

	private String ceklilenKart;

	public String getCekilenKart() {
		return ceklilenKart;
	}

	public void cekilenKartiYazdir() {
		System.out.println("Çekilen Kart : " + getCekilenKart());
	}

	public void setCekilenKart(String cekilenKart) {
		this.ceklilenKart = cekilenKart;
	}

	public void kartCek() {
		List<String> kartlar = getKartlar();
		String yeniKart;
		if (kartlar != null && !kartlar.isEmpty()) {
			yeniKart = kartlar.get(0);
		} else {
			yeniKart = null;
		}
		setCekilenKart(yeniKart);
		if (kartlar != null && !kartlar.isEmpty()) {
			kartlar.remove(0);
		}
		setKartlar(kartlar);
	}

	public void desteOlustur() {
		List<String> deste = new ArrayList<>(Arrays.asList("2", "2", "2", "2", "3", "3", "3", "3", "4", "4", "4", "4",
				"5", "5", "5", "5", "6", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "8", "9", "9", "9", "9",
				"10", "10", "10", "10", "Q", "Q", "Q", "Q", "J", "J", "J", "J", "K", "K", "K", "K", "A", "A", "A", "A",
				"2", "2", "2", "2", "3", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5", "6", "6", "6", "6", "7",
				"7", "7", "7", "8", "8", "8", "8", "9", "9", "9", "9", "10", "10", "10", "10", "Q", "Q", "Q", "Q", "J",
				"J", "J", "J", "K", "K", "K", "K", "A", "A", "A", "A", "2", "2", "2", "2", "3", "3", "3", "3", "4", "4",
				"4", "4", "5", "5", "5", "5", "6", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "8", "9", "9", "9",
				"9", "10", "10", "10", "10", "Q", "Q", "Q", "Q", "J", "J", "J", "J", "K", "K", "K", "K", "A", "A", "A",
				"A", "2", "2", "2", "2", "3", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5", "6", "6", "6", "6",
				"7", "7", "7", "7", "8", "8", "8", "8", "9", "9", "9", "9", "10", "10", "10", "10", "Q", "Q", "Q", "Q",
				"J", "J", "J", "J", "K", "K", "K", "K", "A", "A", "A", "A"));

		kartlariKaristir(deste);
		kartlariKaristir(deste);
		kartlariKaristir(deste);
		kartlariKes(deste);
		setKartlar(deste);
	}

	private static void kartlariKes(List<String> kartlar) {
		int satirSayisi = 156;
		if (kartlar.size() > satirSayisi) {
			kartlar = kartlar.subList(satirSayisi, kartlar.size());
		}
	}

	private static void kartlariKaristir(List<String> dataset) {
		Collections.shuffle(dataset);
	}

}
