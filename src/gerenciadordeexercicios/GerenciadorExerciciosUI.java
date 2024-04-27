package gerenciadordeexercicios;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GerenciadorExerciciosUI extends Application {

    private Gerenciador gerenciador;
    private ListView<String> listaExercicios;

    public GerenciadorExerciciosUI() {
        gerenciador = new Gerenciador();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gerenciador de Exercícios de Academia");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);

        Label labelTitulo = new Label("Exercícios do Mês");
        labelTitulo.setStyle("-fx-font-size: 20px");

        listaExercicios = new ListView<>();

        Button btnAdicionar = new Button("Adicionar Exercício");
        btnAdicionar.setOnAction(e -> adicionarExercicio());

        Button btnExecutar = new Button("Executar Exercício");
        btnExecutar.setOnAction(e -> executarExercicio());

        HBox hboxBotoes = new HBox(10);
        hboxBotoes.setAlignment(Pos.CENTER);
        hboxBotoes.getChildren().addAll(btnAdicionar, btnExecutar);

        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(labelTitulo, listaExercicios, hboxBotoes);
        vbox.setAlignment(Pos.CENTER);

        grid.add(vbox, 0, 0);

        primaryStage.show();
    }

    private void adicionarExercicio() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Adicionar Exercício");
        dialog.setHeaderText("Informe os dados do exercício");

        ButtonType buttonType = new ButtonType("Adicionar", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(buttonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField txtNome = new TextField();
        txtNome.setPromptText("Nome do exercício");
        TextField txtSeries = new TextField();
        txtSeries.setPromptText("Quantidade de séries");
        TextField txtRepeticoes = new TextField();
        txtRepeticoes.setPromptText("Número de repetições");
        TextField txtCarga = new TextField();
        txtCarga.setPromptText("Carga (em kg)");

        grid.add(new Label("Nome:"), 0, 0);
        grid.add(txtNome, 1, 0);
        grid.add(new Label("Séries:"), 0, 1);
        grid.add(txtSeries, 1, 1);
        grid.add(new Label("Repetições:"), 0, 
