public class Main {
    public static void main(String[] args) {
        Artifact artifact1 = new Artifact("Alien Skull", 101);
        Artifact artifact2 = new Artifact("Quantum Cube", 102);
        Artifact artifact3 = new Artifact("Time Crystal", null);

        String rawLog = "105.75";
        double currentEnergy = Double.parseDouble(rawLog);

        double stabilityIndex =
                ArchiveCalculator.calculateStabilityIndex(currentEnergy);

        System.out.println("===== ARCHIVE REPORT =====");
        System.out.println("Total artifacts registered: "
                + Artifact.getTotalArtifacts());

        System.out.println("Universal Cataloging Constant: "
                + String.format("%.3f",
                Artifact.UNIVERSAL_CATALOGING_CONSTANT));

        System.out.println("Current system energy: " + currentEnergy);

        System.out.println("Stability Index: " + stabilityIndex);
    }
}