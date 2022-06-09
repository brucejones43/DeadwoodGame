module dev.bruce.deadwood {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;
    requires java.logging;

    opens dev.brucejones to javafx.fxml;
    exports dev.brucejones;
}