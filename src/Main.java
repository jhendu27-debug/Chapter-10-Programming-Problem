public class Main {
    public static void main(String[] args) {
        Artifact artifact1 = new Artifact("Alien Skull", 101);
        Artifact artifact2 = new Artifact("Quantum Cube", 102);
        Artifact artifact3 = new Artifact("Time Crystal", null);

        double energyLevel = 105.75;

        System.out.println("Artifact 1: " + artifact1.getName());
        System.out.println("Artifact 2: " + artifact2.getName());
        System.out.println("Artifact 3: " + artifact3.getName());

        System.out.println("Total artifacts: " + Artifact.getTotalArtifacts());
        System.out.println("Universal Constant: " + Artifact.UNIVERSAL_CATALOGING_CONSTANT);

        double stabilityIndex =
                ArchiveCalculator.calculateStabilityIndex(energyLevel);

        System.out.println("Stability Index: " + stabilityIndex);
    }
}