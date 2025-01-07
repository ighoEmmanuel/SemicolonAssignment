import java.util.Scanner;

public class MenstrualCycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your average cycle length (in days): ");
        int cycleLength = scanner.nextInt();

        System.out.print("Enter the start date of your last period (day): ");
        int lastPeriodDay = scanner.nextInt();
        System.out.print("Enter the start month of your last period (month): ");
        int lastPeriodMonth = scanner.nextInt();
        System.out.print("Enter the start year of your last period (year): ");
        int lastPeriodYear = scanner.nextInt();

        System.out.print("Enter your average flow duration (in days): ");
        int flowDuration = scanner.nextInt();

        int nextPeriodStartDay = lastPeriodDay + cycleLength;
        int nextPeriodEndDay = nextPeriodStartDay + flowDuration - 1;

        int ovulationDay = nextPeriodStartDay - 14;

        int safeStart1 = lastPeriodDay + flowDuration;
        int safeEnd1 = ovulationDay - 1;
        int safeStart2 = ovulationDay + 1;
        int safeEnd2 = nextPeriodStartDay - 1;

        // Handle month and day overflow
        if (nextPeriodStartDay > 31) {
            nextPeriodStartDay -= 31;
            lastPeriodMonth++;
        }

        if (nextPeriodEndDay > 31) {
            nextPeriodEndDay -= 31;
            lastPeriodMonth++;
        }

        if (lastPeriodMonth > 12) {
            lastPeriodMonth = 1;
            lastPeriodYear++;
        }

        if (ovulationDay > 31) {
            ovulationDay -= 31;
            lastPeriodMonth++;
        }

        if (safeStart1 > 31) {
            safeStart1 -= 31;
            lastPeriodMonth++;
        }

        if (safeEnd1 > 31) {
            safeEnd1 -= 31;
            lastPeriodMonth++;
        }

        if (safeStart2 > 31) {
            safeStart2 -= 31;
            lastPeriodMonth++;
        }

        if (safeEnd2 > 31) {
            safeEnd2 -= 31;
            lastPeriodMonth++;
        }

        if (lastPeriodMonth > 12) {
            lastPeriodMonth = 1;
            lastPeriodYear++;
        }

        System.out.println("\n--- Menstrual Cycle Details ---");
        System.out.println("Next Period Start Date: " + nextPeriodStartDay + "/" + lastPeriodMonth + "/" + lastPeriodYear);
        System.out.println("Next Period End Date: " + nextPeriodEndDay + "/" + lastPeriodMonth + "/" + lastPeriodYear);
        System.out.println("Ovulation Date: " + ovulationDay + "/" + lastPeriodMonth + "/" + lastPeriodYear);
        System.out.println("Safe Periods:");
        System.out.println("  From " + safeStart1 + " to " + safeEnd1 + " (" + lastPeriodMonth + "/" + lastPeriodYear + ")");
        System.out.println("  From " + safeStart2 + " to " + safeEnd2 + " (" + lastPeriodMonth + "/" + lastPeriodYear + ")");

        scanner.close();
    }
}
