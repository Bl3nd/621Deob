/* qe - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class qe
{
    static int a;
    static int b;
    static GameOutPacket c = new GameOutPacket(40, -1);
    static int d;
    static pl e;
    
    static final void a(byte[][] is, gl var_gl, byte i) {
	b++;
	int i_0_ = pw.b.length;
	int i_1_ = 0;
	if (i <= 15)
	    c = null;
	for (/**/; i_1_ < i_0_; i_1_++) {
	    byte[] is_2_ = is[i_1_];
	    if (is_2_ != null) {
		int i_3_ = 64 * (iu.o[i_1_] >> 8) - bfa.thisPlayersRegionX;
		int i_4_ = (0xff & iu.o[i_1_]) * 64 - BytesParser.thisPlayersRegionY;
		naa.d((byte) 76);
		var_gl.a(i_3_, true, lg.r, i_4_, is_2_, su.a);
	    }
	}
    }
    
    public static void a(int i) {
	if (i != -26)
	    c = null;
	e = null;
	c = null;
    }
    
    static final mca a(int i, int i_5_) {
	a++;
	int i_6_ = i_5_;
    while_196_:
	do {
	while_195_:
	    do {
	    while_194_:
		do {
		while_193_:
		    do {
		    while_192_:
			do {
			while_191_:
			    do {
			    while_190_:
				do {
				while_189_:
				    do {
				    while_188_:
					do {
					while_187_:
					    do {
					    while_186_:
						do {
						while_185_:
						    do {
						    while_184_:
							do {
							while_183_:
							    do {
							    while_182_:
								do {
								while_181_:
								    do {
								    while_180_:
									do {
									while_179_:
									    do {
									    while_178_:
										do {
										while_177_:
										    do {
										    while_176_:
											do {
											while_175_:
											    do {
											    while_174_:
												do {
												while_173_:
												    do {
												    while_172_:
													do {
													while_171_:
													    do {
													    while_170_:
														do {
														while_169_:
														    do {
														    while_168_:
															do {
															while_167_:
															    do {
															    while_166_:
																do {
																while_165_:
																    do {
																    while_164_:
																	do {
																	while_163_:
																	    do {
																	    while_162_:
																		do {
																		while_161_:
																		    do {
																		    while_160_:
																			do {
																			while_159_:
																			    do {
																				do {
																				    if (i_6_ != 0) {
																					if (i_6_ != 1) {
																					    if (i_6_ != 2) {
																						if (i_6_ != 3) {
																						    if (i_6_ != 4) {
																							if (i_6_ != 5) {
																							    if (i_6_ != 6) {
																								if (i_6_ != 7) {
																								    if (i_6_ != 8) {
																									if (i_6_ != 9) {
																									    if (i_6_ != 10) {
																										if (i_6_ != 11) {
																										    if (i_6_ != 12) {
																											if (i_6_ != 13) {
																											    if (i_6_ != 14) {
																												if (i_6_ != 15) {
																												    if (i_6_ != 16) {
																													if (i_6_ != 17) {
																													    if (i_6_ != 18) {
																														if (i_6_ != 19) {
																														    if (i_6_ != 20) {
																															if (i_6_ != 21) {
																															    if (i_6_ != 22) {
																																if (i_6_ != 23) {
																																    if (i_6_ != 24) {
																																	if (i_6_ != 25) {
																																	    if (i_6_ != 26) {
																																		if (i_6_ != 27) {
																																		    if (i_6_ != 28) {
																																			if (i_6_ != 29) {
																																			    if (i_6_ != 30) {
																																				if (i_6_ != 31) {
																																				    if (i_6_ != 32) {
																																					if (i_6_ != 33) {
																																					    if (i_6_ != 34) {
																																						if (i_6_ != 35) {
																																						    if (i_6_ != 36) {
																																							if (i_6_ != 37) {
																																							    if (i_6_ != 38) {
																																								if (i_6_ != 39)
																																								    break while_196_;
																																							    } else
																																								break while_194_;
																																							    break while_195_;
																																							}
																																						    } else
																																							break while_192_;
																																						    break while_193_;
																																						}
																																					    } else
																																						break while_190_;
																																					    break while_191_;
																																					}
																																				    } else
																																					break while_188_;
																																				    break while_189_;
																																				}
																																			    } else
																																				break while_186_;
																																			    break while_187_;
																																			}
																																		    } else
																																			break while_184_;
																																		    break while_185_;
																																		}
																																	    } else
																																		break while_182_;
																																	    break while_183_;
																																	}
																																    } else
																																	break while_180_;
																																    break while_181_;
																																}
																															    } else
																																break while_178_;
																															    break while_179_;
																															}
																														    } else
																															break while_176_;
																														    break while_177_;
																														}
																													    } else
																														break while_174_;
																													    break while_175_;
																													}
																												    } else
																													break while_172_;
																												    break while_173_;
																												}
																											    } else
																												break while_170_;
																											    break while_171_;
																											}
																										    } else
																											break while_168_;
																										    break while_169_;
																										}
																									    } else
																										break while_166_;
																									    break while_167_;
																									}
																								    } else
																									break while_164_;
																								    break while_165_;
																								}
																							    } else
																								break while_162_;
																							    break while_163_;
																							}
																						    } else
																							break while_160_;
																						    break while_161_;
																						}
																					    } else
																						break;
																					    break while_159_;
																					}
																				    } else
																					return new Class_jg();
																				    return new wh();
																				} while (false);
																				return new dd();
																			    } while (false);
																			    return new ck();
																			} while (false);
																			return new oea();
																		    } while (false);
																		    return new ofa();
																		} while (false);
																		return new ea();
																	    } while (false);
																	    return new mda();
																	} while (false);
																	return new kq();
																    } while (false);
																    return new Class_u();
																} while (false);
																return new sr();
															    } while (false);
															    return new Class_pf();
															} while (false);
															return new Class_ic();
														    } while (false);
														    return new uq();
														} while (false);
														return new rq();
													    } while (false);
													    return new pc();
													} while (false);
													return new Class_k();
												    } while (false);
												    return new op();
												} while (false);
												return new bba();
											    } while (false);
											    return new gh();
											} while (false);
											return new wm();
										    } while (false);
										    return new gu();
										} while (false);
										return new lba();
									    } while (false);
									    return new cm();
									} while (false);
									return new hk();
								    } while (false);
								    return (new ada
									    ());
								} while (false);
								return (new Class_rb
									());
							    } while (false);
							    return new ffa();
							} while (false);
							return new Class_lc();
						    } while (false);
						    return new cq();
						} while (false);
						return new ge();
					    } while (false);
					    return new wg();
					} while (false);
					return new ut();
				    } while (false);
				    return new ow();
				} while (false);
				return new vd();
			    } while (false);
			    return new vn();
			} while (false);
			return new io();
		    } while (false);
		    return new jo();
		} while (false);
		return new sv();
	    } while (false);
	    return new tc();
	} while (false);
	if (i != -29)
	    a(null, null, (byte) 15);
	return null;
    }
}
