package com.sena.apiparking.service;

import org.springframework.stereotype.Service;

import com.sena.apiparking.repositorio.EspacioParqueoRepository;
import com.sena.apiparking.repositorio.RegistroParqueoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EspacioService {
	private static final int MAX_LOTE = 500;
	
	private final EspacioParqueoRepository espacioRepo;
	private final RegistroParqueoRepository registroRepo;
	
	public EspacioResponse crear () {

}
