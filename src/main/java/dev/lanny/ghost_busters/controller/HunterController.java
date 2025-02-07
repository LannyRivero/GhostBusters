package dev.lanny.ghost_busters.controller;
import java.util.List;

import dev.lanny.ghost_busters.model.GhostModel;
import dev.lanny.ghost_busters.model.HunterModel;

public class HunterController {
    private HunterModel hunter;

    public HunterController(HunterModel hunterModel) {
        if (hunterModel == null) {
            throw new IllegalArgumentException("HunterModel no puede ser nulo");
        }
        this.hunter = hunterModel;
    }

    public List<GhostModel> getCapturedGhosts() {
        return hunter.getCapturedGhosts();
    }

    public void captureGhost(GhostModel ghost1) {
        hunter.captureGhost(ghost1);
    }

}
   

