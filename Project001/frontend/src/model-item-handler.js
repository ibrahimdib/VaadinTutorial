import {PolymerElement,html} from '@polymer/polymer/polymer-element.js';



class ModelItemHandler extends PolymerElement {
    static get template() {
        return html`
            <dom-repeat items="[[messages]]">
                <template><div class='msg' on-click="handleClick">[[item.text]]</div></template>
            </dom-repeat>`;
    }
    static get is() { return 'model-item-handler' }
}
customElements.define(ModelItemHandler.is, ModelItemHandler);