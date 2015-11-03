/*******************************************************************************
 * Copyright (c) 2010 - 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package br.unipampa.lesa.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.swing.JOptionPane;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

import br.unipampa.lesa.Retangulo;

public class RetanguloPart {

	@Inject
	private MDirtyable dirty;
	private Text txtAltura;
	private Text txtResultado;
	private Text txtLargura;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(null);

		Label lblFrmulaEscolhida = new Label(parent, SWT.NONE);
		lblFrmulaEscolhida.setBounds(5, 5, 100, 15);
		lblFrmulaEscolhida.setText("F\u00F3rmula Escolhida:");

		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setBounds(127, 10, 132, 95);
		lblNewLabel.setImage(ResourceManager.getPluginImage("PrimeiroProjetoEmRCP", "icons/retanguloIcone.png"));

		Label lblNewLabel_1 = new Label(parent, SWT.NONE);
		lblNewLabel_1.setBounds(10, 164, 116, 23);
		lblNewLabel_1.setText("Valor da Altura (cm):");

		txtAltura = new Text(parent, SWT.BORDER);
		txtAltura.setBounds(129, 161, 76, 21);

		Button btnCalcularrea = new Button(parent, SWT.NONE);
		btnCalcularrea.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnCalcularrea.setBounds(5, 193, 135, 25);
		btnCalcularrea.setText("Calcular \u00C1rea");

		txtResultado = new Text(parent, SWT.BORDER);
		txtResultado.setEditable(false);
		txtResultado.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		txtResultado.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		txtResultado.setBounds(170, 193, 145, 23);

		Label label = new Label(parent, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		label.setBounds(146, 193, 18, 20);
		label.setText("=");
		
		Label lblValorDaLargura = new Label(parent, SWT.NONE);
		lblValorDaLargura.setText("Valor da Largura (cm):");
		lblValorDaLargura.setBounds(10, 135, 116, 23);
		
		txtLargura = new Text(parent, SWT.BORDER);
		txtLargura.setBounds(129, 132, 76, 21);

		btnCalcularrea.addListener(SWT.MouseUp, new Listener() {
			@Override
			public void handleEvent(Event event) {
				try {
					double altura = Double.parseDouble(txtAltura.getText());
					double largura = Double.parseDouble(txtLargura.getText());
					
					Retangulo retangulo = new Retangulo(altura, largura);
					txtResultado.setText(String.valueOf(retangulo.recuperarArea()));
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null,
							"Ocorreu algum erro na conversão do tipo de dado! Ao invés de ',' use '.' para separar os"
									+ " números reais...");
				}
			}
		});
	}

	@Focus
	public void setFocus() {
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}
}