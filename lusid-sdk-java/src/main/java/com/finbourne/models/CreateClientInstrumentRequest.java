/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateClientInstrumentRequest model.
 */
public class CreateClientInstrumentRequest {
    /**
     * The clientInstrumentId property.
     */
    @JsonProperty(value = "clientInstrumentId", required = true)
    private String clientInstrumentId;

    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The lookThroughPortfolioId property.
     */
    @JsonProperty(value = "lookThroughPortfolioId")
    private ResourceId lookThroughPortfolioId;

    /**
     * Expanded instrument definition - in the case of OTC instruments
     * this contains the definition of the non-exchange traded instrument.
     * The format for this can be client-defined, but in order to transparently
     * use
     * vendor libraries it must conform to a format that LUSID understands.
     */
    @JsonProperty(value = "instrument")
    private InstrumentDefinition instrument;

    /**
     * Get the clientInstrumentId value.
     *
     * @return the clientInstrumentId value
     */
    public String clientInstrumentId() {
        return this.clientInstrumentId;
    }

    /**
     * Set the clientInstrumentId value.
     *
     * @param clientInstrumentId the clientInstrumentId value to set
     * @return the CreateClientInstrumentRequest object itself.
     */
    public CreateClientInstrumentRequest withClientInstrumentId(String clientInstrumentId) {
        this.clientInstrumentId = clientInstrumentId;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreateClientInstrumentRequest object itself.
     */
    public CreateClientInstrumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lookThroughPortfolioId value.
     *
     * @return the lookThroughPortfolioId value
     */
    public ResourceId lookThroughPortfolioId() {
        return this.lookThroughPortfolioId;
    }

    /**
     * Set the lookThroughPortfolioId value.
     *
     * @param lookThroughPortfolioId the lookThroughPortfolioId value to set
     * @return the CreateClientInstrumentRequest object itself.
     */
    public CreateClientInstrumentRequest withLookThroughPortfolioId(ResourceId lookThroughPortfolioId) {
        this.lookThroughPortfolioId = lookThroughPortfolioId;
        return this;
    }

    /**
     * Get expanded instrument definition - in the case of OTC instruments
     this contains the definition of the non-exchange traded instrument.
     The format for this can be client-defined, but in order to transparently use
     vendor libraries it must conform to a format that LUSID understands.
     *
     * @return the instrument value
     */
    public InstrumentDefinition instrument() {
        return this.instrument;
    }

    /**
     * Set expanded instrument definition - in the case of OTC instruments
     this contains the definition of the non-exchange traded instrument.
     The format for this can be client-defined, but in order to transparently use
     vendor libraries it must conform to a format that LUSID understands.
     *
     * @param instrument the instrument value to set
     * @return the CreateClientInstrumentRequest object itself.
     */
    public CreateClientInstrumentRequest withInstrument(InstrumentDefinition instrument) {
        this.instrument = instrument;
        return this;
    }

}
