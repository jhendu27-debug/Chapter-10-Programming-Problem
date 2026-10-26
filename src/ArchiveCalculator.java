public class ArchiveCalculator {

    public static double calculateStabilityIndex(double energyLevel) {
        return Math.sqrt(
                Math.abs(energyLevel - Artifact.UNIVERSAL_CATALOGING_CONSTANT)
        );
    }
}