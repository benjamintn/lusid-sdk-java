package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.ResourceListOfInstrument;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
    Utility to load a set of instruments into LUSID
 */
public class InstrumentLoader {

    private InstrumentsApi  instrumentsApi;

    public InstrumentLoader(InstrumentsApi instrumentsApi) {
        this.instrumentsApi = instrumentsApi;
    }

    /**
     *  Returns  a set of instruments from LUSID
     *
     * @return List of LUSID instrument ids
     */
    List<String> getInstruments() throws ApiException {

        ResourceListOfInstrument instruments = instrumentsApi.listInstruments(null, null, null, null, null, 5, null, null);

        return instruments
                .getValues()
                .stream()
                .sorted(Comparator.comparing(Instrument::getName))
                .map(Instrument::getLusidInstrumentId)
                .collect(Collectors.toList());
    }
}
