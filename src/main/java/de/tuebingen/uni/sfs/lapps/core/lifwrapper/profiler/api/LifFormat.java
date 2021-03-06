/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuebingen.uni.sfs.lapps.core.lifwrapper.profiler.api;

import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifConstituentParser;
import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifDependencyParser;
import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifNameEntityLayer;
import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifReferenceLayer;
import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifSentenceLayer;
import de.tuebingen.uni.sfs.lapps.core.lifwrapper.anno.api.LifTokenLayer;
import de.tuebingen.uni.sfs.lapps.exceptions.LifException;
/**
 *
 * @author felahi
 */
public interface LifFormat extends ValidityChecker {

    public String getLanguage() throws LifException;

    public String getText() throws LifException;

    public String getFileString();

    public LifTokenLayer getLifTokenLayer();

    public LifSentenceLayer getLifSentenceLayer();

    public LifNameEntityLayer getLifNameEntityLayer();

    public LifDependencyParser getLifDependencyParser();

    public LifConstituentParser getLifConstituentParser();

    public LifReferenceLayer getLifRefererenceLayer();
}
