/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuebingen.uni.sfs.lapps.core.converter.impl;

import de.tuebingen.uni.sfs.lapps.core.converter.utils.LifToTcfConversionAssertUtils;
import de.tuebingen.uni.sfs.lapps.exceptions.ConversionException;
import java.io.InputStream;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Mohammad Fazleh Elahi
 */
public class LifToTcfLayerDependencyParseConversionTest {

    private String DEPENDENCY_PARSE_LAYER_LIF_INPUT = "/data/dep/lif-dependencyLayer.json";
    private String DEPENDENCY_PARSE_LAYER_TCF_EXPECTED_OUTPUT = "/data/dep/lif-dependencyLayer-output-expected.xml";

    private String DEPENDENCY_PARSE_LAYER_LIF_SENTENCE_LAYER_SEPERATE_INPUT = "/data/dep/lif-dependencyLayer-with-sentencelayer-seperate.json";
    private String DEPENDENCY_PARSE_LAYER_TCF_SENTENCE_LAYER_SEPERATE_EXPECTED_OUTPUT = "/data/dep/lif-dependencyLayer-with-senetencelayer-seperate-output-expected.xml";

    private String DEPENDENCY_PARSE_LAYER_LIF_WITHOUT_SENTENCE_INPUT = "/data/dep/lif-dependencyLayer-without-sentence.json";
    private String DEPENDENCY_PARSE_LAYER_LIF_WITHOUT_ROOT_INPUT = "/data/dep/lif-dependencyLayer-without-root.json";

    /**
     * Test of lif to tcf toDependency layer conversion. This is a test of
     * dependency parser when everything is in place.
     */
    @Test
    public void testLayerConversion_whenDependencyParserLayer() throws Exception {
        System.out.println("testLayerConversion_whenDependencyParserLayer");
        InputStream input = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_LIF_INPUT);
        InputStream expectedOutput = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_TCF_EXPECTED_OUTPUT);
        LifToTcfConversionAssertUtils.lifToTcfAssertEqual(input, expectedOutput);
    }

    /**
     * Test of lif to tcf toDependency layer conversion. This test when sentence
     * layer is not inside in dependency structure layer.
     */
    @Test
    public void testLayerConversion_whenDependencyParserLayer_WithSenetenceSeperate() throws Exception {
        System.out.println("testLayerConversion_whenDependencyParserLayerr__WithSenetenceSeperate");
        InputStream input = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_LIF_SENTENCE_LAYER_SEPERATE_INPUT);
        InputStream expectedOutput = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_TCF_SENTENCE_LAYER_SEPERATE_EXPECTED_OUTPUT);
        LifToTcfConversionAssertUtils.lifToTcfAssertEqual(input, expectedOutput);
    }

    /**
     * Test of lif to tcf toDependency layer conversion. This is a test when
     * sentence layer does not exist.
     */
    @Test(expected = ConversionException.class)
    public void testLayerConversion_whenDependencyParserLayer_WithoutSentence() throws Exception {
        System.out.println("testLayerConversion_whenDependencyParserLayerr_WithoutSentence");
        InputStream input = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_LIF_WITHOUT_SENTENCE_INPUT);
        LifToTcfConversionAssertUtils.lifToTcf(input);
    }
    
    /**
     * Test of lif to tcf toDependency layer conversion. This is a test when
     * there is no root node found for a parse . 
     */
    @Test(expected = ConversionException.class)
    public void testLayerConversion_whenDependencyParserLayer_WithoutRoot() throws Exception {
        System.out.println("testLayerConversion_whenDependencyParserLayerr_WithoutSentence");
        InputStream input = this.getClass().getResourceAsStream(DEPENDENCY_PARSE_LAYER_LIF_WITHOUT_ROOT_INPUT);
        LifToTcfConversionAssertUtils.lifToTcf(input);
    }

}
