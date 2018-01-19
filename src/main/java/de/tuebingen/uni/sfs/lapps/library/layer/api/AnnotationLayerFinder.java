/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuebingen.uni.sfs.lapps.library.layer.api;

import de.tuebingen.uni.sfs.lapps.library.exception.VocabularyMappingException;

/**
 *
 * @author This interface finds the annotation layer from a file
 */
public interface AnnotationLayerFinder {

    public boolean isLayerExists() throws VocabularyMappingException;

    public boolean isToolExists(String tool) throws VocabularyMappingException;

    public String getLayer();

    public String getTool() throws VocabularyMappingException;

    public String getProducer() throws VocabularyMappingException;

    public String getTagSetName(String tool) throws VocabularyMappingException;

    public String getVocabularies(String tool, String key) throws VocabularyMappingException;

    public void getLayerFromSingleUrl();

    public void getLayerFromMultipleUrls();

}