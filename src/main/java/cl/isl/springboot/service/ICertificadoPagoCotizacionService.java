package cl.isl.springboot.service;

import javax.validation.Valid;

import cl.isl.springboot.dto.ConsultaCertificadoDTO;
import cl.isl.springboot.model.CertificadoPagoCotizacion;

public interface ICertificadoPagoCotizacionService extends ICRUD<CertificadoPagoCotizacion>{
	
	CertificadoPagoCotizacion registrarCertificado(@Valid ConsultaCertificadoDTO consulta);
}
