package com.workintech.developers;

public class HRManager extends Employee {

    // Developer dizileri
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10]; // Junior developer dizisi
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];          // Mid developer dizisi
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10]; // Senior developer dizisi

    // Dizilerin doluluk durumunu takip eden indeks değişkenleri
    private int juniorIndex = 0;
    private int midIndex = 0;
    private int seniorIndex = 0;

    /**
     * HRManager constructor'ı
     * @param id HR Manager ID'si
     * @param name HR Manager adı
     * @param salary HR Manager maaşı
     */
    public HRManager(int id, String name, int salary) {
        super(id, name, salary); // Üst sınıf constructor'ını çağır
    }

    /**
     * HRManager'ın çalışma metodunu override eder
     * HRManager çalışırken maaşı yükseltilir
     */
    @Override
    public void work() {
        System.out.println("HR Manager is organizing team and managing recruitment processes.");
        setSalary(getSalary() + 1500); // HR Manager'ın maaşını arttır
    }

    /**
     * Junior Developer eklemek için overloaded metod
     * @param developer Eklenecek Junior Developer
     */
    public void addEmployee(JuniorDeveloper developer) {
        // Dizi doluysa uyarı ver
        if (juniorIndex >= juniorDevelopers.length) {
            System.out.println("Warning: Junior developer array is full!");
            return;
        }

        // Developer'ı diziye ekle ve indeksi arttır
        juniorDevelopers[juniorIndex] = developer;
        juniorIndex++;
    }

    /**
     * Mid Developer eklemek için overloaded metod
     * @param developer Eklenecek Mid Developer
     */
    public void addEmployee(MidDeveloper developer) {
        // Dizi doluysa uyarı ver
        if (midIndex >= midDevelopers.length) {
            System.out.println("Warning: Mid developer array is full!");
            return;
        }

        // Developer'ı diziye ekle ve indeksi arttır
        midDevelopers[midIndex] = developer;
        midIndex++;
    }

    /**
     * Senior Developer eklemek için overloaded metod
     * @param developer Eklenecek Senior Developer
     */
    public void addEmployee(SeniorDeveloper developer) {
        // Dizi doluysa uyarı ver
        if (seniorIndex >= seniorDevelopers.length) {
            System.out.println("Warning: Senior developer array is full!");
            return;
        }

        // Developer'ı diziye ekle ve indeksi arttır
        seniorDevelopers[seniorIndex] = developer;
        seniorIndex++;
    }
}