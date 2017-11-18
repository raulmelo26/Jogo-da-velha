package PckNovoJogoVelha;

/**
 *
 * @author Raul Melo
 */
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {

    JButton[] buttons = new JButton[9];
    private int contaJogadas = 0;
    private boolean isX;

    private boolean vezJogador1 = true;

    private int numVitoriasJogador1 = 0;
    private int numVitoriasJogador2 = 0;

    private boolean houveGanhador = false;

    private int ultimaJogada = -1;
    URL url;
    AudioClip audio;

    String nomeJoga1 = "jogador 1";
    String imgJogador1 = "/Pckimagens/corno.jpg";
    String corJogador1 = "Azul";

    String nomeJoga2 = "jogador 2";
    String imgJogador2 = "/Pckimagens/corno.jpg";
    String corJogador2 = "Azul";

    long startTime;
    long endTime;
    float difTime;
    boolean houveEmpate = false;
    String data;
    String horaInicio;
    String vencedorPartida;

    ArrayList<Jogadas> arquivoJogos = new ArrayList<Jogadas>();

    public TelaJogo() {
        initComponents();
        setBounds(100, 100, 506, 600);
        setResizable(false);
        setTitle("Jogo da Velha do S4 - 2016.1");
        lblMensagem.setForeground(new Color(0, 0, 0));
        desfazerJogada.setEnabled(false);
        buttons[0] = btnPosicao00;
        buttons[1] = btnPosicao01;
        buttons[2] = btnPosicao02;
        buttons[3] = btnPosicao10;
        buttons[4] = btnPosicao11;
        buttons[5] = btnPosicao12;
        buttons[6] = btnPosicao20;
        buttons[7] = btnPosicao21;
        buttons[8] = btnPosicao22;
        desabilitaButton();

        try {
            Deserializador d = new Deserializador();
            arquivoJogos = (ArrayList<Jogadas>) d.deserializar("RANKING.txt");
        } catch (Exception e) {
            System.out.println("Erro na deserialização");
        }

        /*for (Jogadas jogadas : arquivoJogos) {
            System.out.println("Nome : " + jogadas.getNomeVencedor());
        }*/
        // é importante o trecho de código abaixo
        url = getClass().getResource("");
        audio = Applet.newAudioClip(url);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPosicao00 = new javax.swing.JButton();
        btnPosicao01 = new javax.swing.JButton();
        btnPosicao02 = new javax.swing.JButton();
        btnPosicao10 = new javax.swing.JButton();
        btnPosicao11 = new javax.swing.JButton();
        btnPosicao12 = new javax.swing.JButton();
        btnPosicao20 = new javax.swing.JButton();
        btnPosicao21 = new javax.swing.JButton();
        btnPosicao22 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblPlacar = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        lblJogador1 = new javax.swing.JLabel();
        lblimagem1 = new javax.swing.JLabel();
        lblimagem2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        mntmNovoJogo = new javax.swing.JMenuItem();
        mntmNovoCampeonato = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mntmSair = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        desfazerJogada = new javax.swing.JMenuItem();
        menuConfigureGame = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(236, 236, 159));
        setName("TelaJogo"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(236, 236, 159));
        jPanel1.setForeground(new java.awt.Color(236, 236, 159));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 550));

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem.setText("Vez do Jogador 1");

        jPanel2.setBackground(new java.awt.Color(236, 236, 159));
        jPanel2.setLayout(null);

        btnPosicao00.setBackground(new java.awt.Color(247, 245, 196));
        btnPosicao00.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao00.setForeground(new java.awt.Color(247, 245, 196));
        btnPosicao00.setAlignmentY(0.0F);
        btnPosicao00.setBorder(null);
        btnPosicao00.setBorderPainted(false);
        btnPosicao00.setContentAreaFilled(false);
        btnPosicao00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao00ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao00);
        btnPosicao00.setBounds(30, 10, 80, 70);

        btnPosicao01.setBackground(new java.awt.Color(235, 236, 158));
        btnPosicao01.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao01.setForeground(new java.awt.Color(235, 236, 158));
        btnPosicao01.setContentAreaFilled(false);
        btnPosicao01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao01ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao01);
        btnPosicao01.setBounds(140, 10, 80, 70);

        btnPosicao02.setBackground(new java.awt.Color(247, 245, 196));
        btnPosicao02.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao02.setContentAreaFilled(false);
        btnPosicao02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao02ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao02);
        btnPosicao02.setBounds(250, 10, 80, 70);

        btnPosicao10.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao10.setToolTipText("");
        btnPosicao10.setBorderPainted(false);
        btnPosicao10.setContentAreaFilled(false);
        btnPosicao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao10ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao10);
        btnPosicao10.setBounds(25, 110, 80, 80);

        btnPosicao11.setBackground(new java.awt.Color(247, 245, 196));
        btnPosicao11.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao11.setForeground(new java.awt.Color(247, 245, 196));
        btnPosicao11.setContentAreaFilled(false);
        btnPosicao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao11ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao11);
        btnPosicao11.setBounds(140, 110, 80, 80);

        btnPosicao12.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao12.setContentAreaFilled(false);
        btnPosicao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao12ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao12);
        btnPosicao12.setBounds(250, 110, 78, 80);

        btnPosicao20.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao20.setContentAreaFilled(false);
        btnPosicao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao20ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao20);
        btnPosicao20.setBounds(20, 230, 80, 70);

        btnPosicao21.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao21.setContentAreaFilled(false);
        btnPosicao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao21ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao21);
        btnPosicao21.setBounds(140, 230, 80, 68);

        btnPosicao22.setBackground(new java.awt.Color(247, 245, 196));
        btnPosicao22.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        btnPosicao22.setForeground(new java.awt.Color(247, 245, 196));
        btnPosicao22.setContentAreaFilled(false);
        btnPosicao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicao22ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosicao22);
        btnPosicao22.setBounds(260, 230, 78, 68);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/grade3.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-10, 0, 370, 310);

        lblPlacar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPlacar.setText("Placar:");

        lblJogador2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblJogador2.setText("Jogador 2:");

        lblJogador1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblJogador1.setText("Jogador 1: ");

        lblimagem1.setPreferredSize(new java.awt.Dimension(50, 50));

        lblimagem2.setBackground(new java.awt.Color(255, 255, 255));
        lblimagem2.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblimagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(lblimagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(lblJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPlacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(lblimagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/file.png"))); // NOI18N
        Arquivo.setText("Arquivo");

        mntmNovoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/Jogo.jpg"))); // NOI18N
        mntmNovoJogo.setText("Novo jogo");
        mntmNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmNovoJogoActionPerformed(evt);
            }
        });
        Arquivo.add(mntmNovoJogo);

        mntmNovoCampeonato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/group_add.png"))); // NOI18N
        mntmNovoCampeonato.setText("Novo Campeonato");
        mntmNovoCampeonato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmNovoCampeonatoActionPerformed(evt);
            }
        });
        Arquivo.add(mntmNovoCampeonato);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/folder_page.png"))); // NOI18N
        jMenuItem3.setText("Histórico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Arquivo.add(jMenuItem3);

        mntmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/cancel.png"))); // NOI18N
        mntmSair.setText("Sair");
        mntmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmSairActionPerformed(evt);
            }
        });
        Arquivo.add(mntmSair);

        jMenuBar1.add(Arquivo);

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/chat-event.png"))); // NOI18N
        Editar.setText("Editar");

        desfazerJogada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/arrow_rotate_clockwise.png"))); // NOI18N
        desfazerJogada.setText("Desfazer jogada");
        desfazerJogada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desfazerJogadaActionPerformed(evt);
            }
        });
        Editar.add(desfazerJogada);

        menuConfigureGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/confi.jpg"))); // NOI18N
        menuConfigureGame.setText("Configurações de jogo");
        menuConfigureGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfigureGameActionPerformed(evt);
            }
        });
        Editar.add(menuConfigureGame);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/podium1.jpg"))); // NOI18N
        jMenuItem2.setText("Ranking");
        Editar.add(jMenuItem2);

        jMenuBar1.add(Editar);

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/olhos.jpg"))); // NOI18N
        Sobre.setText("Sobre");

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pckimagens/desen.jpg"))); // NOI18N
        menuSobre.setText("Aplicativo");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        Sobre.add(menuSobre);

        jMenuBar1.add(Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntmNovoCampeonatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmNovoCampeonatoActionPerformed
        Serializador s = new Serializador();
        try {
            s.serializar("RANKING.txt", arquivoJogos);
            arquivoJogos = null;
        } catch (Exception e) {
            System.out.println("Erro na serialização do arquivo");
        }

        limpaTabuleiro();

        if (vezJogador1) {

            lblMensagem.setForeground(new Color(0, 0, 128));
            lblMensagem.setText("É a vez Jogador 1");
        } else {

            lblMensagem.setForeground(new Color(128, 0, 0));
            lblMensagem.setText("É a vez Jogador 2");

        }

        lblJogador1.setText("Jogador 1: 0");
        lblJogador2.setText("Jogador 2: 0");

        numVitoriasJogador1 = 0;
        numVitoriasJogador2 = 0;
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        desfazerJogada.setEnabled(false);
    }//GEN-LAST:event_mntmNovoCampeonatoActionPerformed

    private void btnPosicao00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao00ActionPerformed
        //buttons[0] = btnPosicao00;
        isPlayer(0);
        verificaGanhador(0, 0);

    }//GEN-LAST:event_btnPosicao00ActionPerformed

    private void btnPosicao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao01ActionPerformed
        //buttons[1] = btnPosicao01;
        isPlayer(1);
        verificaGanhador(0, 1);
    }//GEN-LAST:event_btnPosicao01ActionPerformed

    private void btnPosicao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao02ActionPerformed
        //buttons[2] = btnPosicao02;
        isPlayer(2);
        verificaGanhador(0, 2);

    }//GEN-LAST:event_btnPosicao02ActionPerformed

    private void btnPosicao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao10ActionPerformed
        // buttons[3] = btnPosicao10;
        isPlayer(3);
        verificaGanhador(1, 0);

    }//GEN-LAST:event_btnPosicao10ActionPerformed

    private void btnPosicao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao11ActionPerformed
        //buttons[4] = btnPosicao11;
        isPlayer(4);
        verificaGanhador(1, 1);

    }//GEN-LAST:event_btnPosicao11ActionPerformed

    private void btnPosicao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao12ActionPerformed
        //buttons[5] = btnPosicao12;
        isPlayer(5);
        verificaGanhador(1, 2);

    }//GEN-LAST:event_btnPosicao12ActionPerformed

    private void btnPosicao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao20ActionPerformed
        //buttons[6] = btnPosicao20;
        isPlayer(6);
        verificaGanhador(2, 0);

    }//GEN-LAST:event_btnPosicao20ActionPerformed

    private void btnPosicao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao21ActionPerformed
        //buttons[7] = btnPosicao21;
        isPlayer(7);
        verificaGanhador(2, 1);

    }//GEN-LAST:event_btnPosicao21ActionPerformed

    private void btnPosicao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicao22ActionPerformed
        //buttons[8] = btnPosicao22;
        isPlayer(8);
        verificaGanhador(2, 2);


    }//GEN-LAST:event_btnPosicao22ActionPerformed

    private void mntmNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmNovoJogoActionPerformed
        data = LocalDate.now().toString();
        horaInicio = LocalTime.now().toString();
        startTime = System.currentTimeMillis();
        lblimagem1.setIcon((new javax.swing.ImageIcon(getClass().getResource(imgJogador1))));
        lblimagem2.setIcon((new javax.swing.ImageIcon(getClass().getResource(imgJogador2))));
        lblJogador1.setText(nomeJoga1 + ": " + numVitoriasJogador1);
        lblJogador2.setText(nomeJoga2 + ": " + numVitoriasJogador2);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(true);
        }

        limpaTabuleiro();
        mudaCor(0, isX);

        /*if (vezJogador1) {
            if (corJogador1.equals("Azul")) {
                lblMensagem.setForeground(new Color(0, 0, 128));
               
            } else if (corJogador1.equals("Vermelho")) {
               lblMensagem.setForeground(new Color(128, 0, 0));
            } else {
                lblMensagem.setForeground(new Color(0, 128, 0));
            }
            lblMensagem.setText("Vez do " + nomeJoga1);
        } else {
            
            if (corJogador2.equals("Azul")) {
               lblMensagem.setForeground(new Color(0, 0, 128));
            } else if (corJogador2.equals("Vermelho")) {
                lblMensagem.setForeground(new Color(128, 0, 0));
            } else {
                lblMensagem.setForeground(new Color(0, 128, 0));
            }
            //lblMensagem.setForeground(new Color(128, 0, 0));
            lblMensagem.setText("Vez do " + nomeJoga2);

        }*/
    }//GEN-LAST:event_mntmNovoJogoActionPerformed

    private void mntmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmSairActionPerformed
        Serializador s = new Serializador();
        try {
            s.serializar("RANKING.txt", arquivoJogos);
            arquivoJogos = null;
        } catch (Exception e) {
            System.out.println("Erro na serialização do arquivo");
        }
        System.exit(0);
    }//GEN-LAST:event_mntmSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Aplicativo desenvolvido por Hélio, Pedro e Raul");
        Sobre guiaSobre = new Sobre();
        guiaSobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuConfigureGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfigureGameActionPerformed
        ConfigureGame game = new ConfigureGame();
        game.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_menuConfigureGameActionPerformed

    private void desfazerJogadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desfazerJogadaActionPerformed
        // TODO add your handling code here:
        if (ultimaJogada != -1) {
            if (buttons[ultimaJogada].getText().equalsIgnoreCase("X")) {
                //lblMensagem.setForeground(Color.blue);
                lblMensagem.setText("Vez do Jogador 1");
            } else {
                //lblMensagem.setForeground(Color.red);
                lblMensagem.setText("Vez do Jogador 2");
            }
            buttons[ultimaJogada].setText("");
            contaJogadas--;
            vezJogador1 = !vezJogador1;
            desfazerJogada.setEnabled(false);

        }
        url = getClass().getResource("desfazerjogada.wav");
        audio = Applet.newAudioClip(url);
        audio.play();
    }//GEN-LAST:event_desfazerJogadaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        HistoricoJogadas telaHis = new HistoricoJogadas();
        telaHis.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    protected void limpaTabuleiro() {

        houveGanhador = false;
        contaJogadas = 0;

        btnPosicao00.setText("");
        btnPosicao01.setText("");
        btnPosicao02.setText("");

        btnPosicao10.setText("");
        btnPosicao11.setText("");
        btnPosicao12.setText("");

        btnPosicao20.setText("");
        btnPosicao21.setText("");
        btnPosicao22.setText("");

    }

    private void verificaGanhador(int posX, int posY) {

        if (contaJogadas < 5) {
            return;
        }

        //Verificar se houve ganhador na linha
        //Verificar se houve ganhador na coluna
        //Verificar se houve ganhador na diagonal principal
        if (posX == posY) {
            if (btnPosicao00.getText().equals(btnPosicao11.getText())
                    && btnPosicao11.getText().equals(btnPosicao22.getText())) {

                isX = btnPosicao00.getText().equalsIgnoreCase("X");
                isX(isX);
                btnPosicao01.setText("");
                btnPosicao02.setText("");
                btnPosicao10.setText("");
                btnPosicao12.setText("");
                btnPosicao20.setText("");
                btnPosicao21.setText("");
            }
        }

        //Verificar se houve ganhador na diagonal secundária
        if (posX + posY == 2) {
            if (btnPosicao02.getText().equals(btnPosicao11.getText())
                    && btnPosicao11.getText().equals(btnPosicao20.getText())) {

                isX = btnPosicao02.getText().equalsIgnoreCase("X");
                isX(isX);
                btnPosicao00.setText("");
                btnPosicao01.setText("");
                btnPosicao10.setText("");
                btnPosicao12.setText("");
                btnPosicao21.setText("");
                btnPosicao22.setText("");
            }
        }

        if (btnPosicao00.getText().equals(btnPosicao01.getText()) && posX == 0
                && btnPosicao01.getText().equals(btnPosicao02.getText())) {
            // PRIMEIRA LINHA
            isX = btnPosicao00.getText().equalsIgnoreCase("X");
            isX(isX);
            btnPosicao10.setText("");
            btnPosicao11.setText("");
            btnPosicao12.setText("");

            btnPosicao20.setText("");
            btnPosicao21.setText("");
            btnPosicao22.setText("");
        }

        if (btnPosicao10.getText().equals(btnPosicao11.getText()) && posX == 1
                && btnPosicao11.getText().equals(btnPosicao12.getText())) {
            // SEGUNDA LINHA
            isX = btnPosicao10.getText().equalsIgnoreCase("X");
            isX(isX);
            btnPosicao00.setText("");
            btnPosicao01.setText("");
            btnPosicao02.setText("");

            btnPosicao20.setText("");
            btnPosicao21.setText("");
            btnPosicao22.setText("");

        }

        if (btnPosicao20.getText().equals(btnPosicao21.getText()) && posX == 2
                && btnPosicao21.getText().equals(btnPosicao22.getText())) {
            // TERCEIRA LINHA
            isX = btnPosicao20.getText().equalsIgnoreCase("X");
            isX(isX);
            btnPosicao00.setText("");
            btnPosicao01.setText("");
            btnPosicao02.setText("");

            btnPosicao10.setText("");
            btnPosicao11.setText("");
            btnPosicao12.setText("");
        }

        if (btnPosicao00.getText().equals(btnPosicao10.getText()) && posY == 0
                && btnPosicao10.getText().equals(btnPosicao20.getText())) {
            // PRIMEIRA COLUNA
            isX = btnPosicao00.getText().equalsIgnoreCase("X");
            isX(isX);

            btnPosicao01.setText("");
            btnPosicao02.setText("");

            btnPosicao11.setText("");
            btnPosicao12.setText("");

            btnPosicao21.setText("");
            btnPosicao22.setText("");

        }
        if (btnPosicao01.getText().equals(btnPosicao11.getText()) && posY == 1
                && btnPosicao11.getText().equals(btnPosicao21.getText())) {
            // SEGUNDA COLUNA
            isX = btnPosicao01.getText().equalsIgnoreCase("X");
            isX(isX);
            btnPosicao00.setText("");

            btnPosicao02.setText("");

            btnPosicao10.setText("");

            btnPosicao12.setText("");

            btnPosicao20.setText("");

            btnPosicao22.setText("");
        }

        if (btnPosicao02.getText().equals(btnPosicao12.getText()) && posY == 2
                && btnPosicao12.getText().equals(btnPosicao22.getText())) {
            // TERCEIRA COLUNA
            isX = btnPosicao02.getText().equalsIgnoreCase("X");
            isX(isX);
            btnPosicao00.setText("");
            btnPosicao01.setText("");

            btnPosicao10.setText("");
            btnPosicao11.setText("");

            btnPosicao20.setText("");
            btnPosicao21.setText("");

        }

        //Verificar se foi a última jogada
        if (contaJogadas == 9 && !houveGanhador) {
            //lblMensagem.setForeground(new Color(0, 100, 0));
            lblMensagem.setText("Houve empate!");
            houveEmpate = true;
            return;
        }

    }

    private void isPlayer(int i) {
        if (buttons[i].getText().isEmpty() && !houveGanhador) {
            // Jogador 1
            if (vezJogador1) {
                //buttons[i].setForeground(new Color(0, 0, 128));
                mudaCor(i, vezJogador1);
                buttons[i].setText("X");
                //btnPosicao00.setBackground(new Color(200,40,204));

                //lblMensagem.setForeground(new Color(128, 0, 0));
                lblMensagem.setText("É a vez do " + nomeJoga2);

                vezJogador1 = false;

            } else {
                // Jogador 2
                //buttons[i].setForeground(new Color(128, 0, 0));
                mudaCor(i, vezJogador1);
                buttons[i].setText("O");

                //lblMensagem.setForeground(new Color(0, 0, 128));
                lblMensagem.setText("É a vez do " + nomeJoga1);

                vezJogador1 = true;
            }
            contaJogadas++;
            ultimaJogada = i;
            desfazerJogada.setEnabled(true);
            url = getClass().getResource("birl .wav");
            audio = Applet.newAudioClip(url);
            audio.play();

        }
    }

    private void isX(boolean isX) {
        if (isX) {
            //lblMensagem.setForeground(new Color(0, 0, 128));
            lblMensagem.setText(nomeJoga1 + " venceu!!!");
            numVitoriasJogador1++;
            lblJogador1.setText(nomeJoga1 + ": " + String.valueOf(numVitoriasJogador1));
            endTime = System.currentTimeMillis();
            desabilitaButton();
            vencedorPartida = nomeJoga1;

        } else {
            //lblMensagem.setForeground(new Color(128, 0, 0));
            lblMensagem.setText(nomeJoga2 + " venceu!!!");
            numVitoriasJogador2++;
            lblJogador2.setText(nomeJoga2 + ": " + String.valueOf(numVitoriasJogador2));
            endTime = System.currentTimeMillis();
            desabilitaButton();
            vencedorPartida = nomeJoga2;

        }
        houveGanhador = true;
        desfazerJogada.setEnabled(false);
        audio.stop();
        url = getClass().getResource("youWin.wav");
        audio = Applet.newAudioClip(url);
        audio.play();
        difTime = (endTime - startTime) / 1000;
        salvarJogo();

    }

    void mudaCor(int button, boolean player) {
        if (vezJogador1) {
            if (corJogador1.equals("Azul")) {
                //lblMensagem.setForeground(new Color(0, 0, 128));
                buttons[button].setForeground(new Color(0, 0, 128));
            } else if (corJogador1.equals("Vermelho")) {
                //lblMensagem.setForeground(new Color(128, 0, 0));
                buttons[button].setForeground(new Color(128, 0, 0));
            } else {
                //lblMensagem.setForeground(new Color(0, 128, 0));
                buttons[button].setForeground(new Color(0, 128, 0));
            }
            lblMensagem.setText("Vez do " + nomeJoga1);
        } else {

            if (corJogador2.equals("Azul")) {
                //lblMensagem.setForeground(new Color(0, 0, 128));
                buttons[button].setForeground(new Color(0, 0, 128));
            } else if (corJogador2.equals("Vermelho")) {
                //lblMensagem.setForeground(new Color(128, 0, 0));
                buttons[button].setForeground(new Color(128, 0, 0));
            } else {
                //lblMensagem.setForeground(new Color(0, 128, 0));
                buttons[button].setForeground(new Color(0, 128, 0));
            }
            //lblMensagem.setForeground(new Color(128, 0, 0));
            lblMensagem.setText("Vez do " + nomeJoga2);

        }
    }

    void desabilitaButton() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        desfazerJogada.setEnabled(false);
    }

    void salvarJogo() {
        Jogadas jogo = new Jogadas(vencedorPartida, data, horaInicio, difTime);
        arquivoJogos.add(jogo);

        for (Jogadas jogadas : arquivoJogos) {
            System.out.println("Nome : " + jogadas.getNomeVencedor());
        }
        /*try {
            Jogadas jogo = new Jogadas(vencedorPartida, hoje, horarioDeEntrada, difTime);
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("RANKING.txt")));
            objectOut.writeObject(jogo);
            objectOut.close();
            try{
            ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("RANKING.txt",a)));
            Jogadas so = (Jogadas)objectIn.readObject();
            objectIn.close();
            System.out.println(so.toString());
            }catch( ClassNotFoundException e){
                System.out.println("Erro na leitura do arquivo");
            }
        } catch (IOException e) {
            System.out.println("Erro no arquivo");
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenu Sobre;
    private javax.swing.JButton btnPosicao00;
    private javax.swing.JButton btnPosicao01;
    private javax.swing.JButton btnPosicao02;
    private javax.swing.JButton btnPosicao10;
    private javax.swing.JButton btnPosicao11;
    private javax.swing.JButton btnPosicao12;
    private javax.swing.JButton btnPosicao20;
    private javax.swing.JButton btnPosicao21;
    private javax.swing.JButton btnPosicao22;
    private javax.swing.JMenuItem desfazerJogada;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblPlacar;
    private javax.swing.JLabel lblimagem1;
    private javax.swing.JLabel lblimagem2;
    private javax.swing.JMenuItem menuConfigureGame;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem mntmNovoCampeonato;
    private javax.swing.JMenuItem mntmNovoJogo;
    private javax.swing.JMenuItem mntmSair;
    // End of variables declaration//GEN-END:variables
}
