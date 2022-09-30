import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizarBody1Component } from './actualizar-body1.component';

describe('ActualizarBody1Component', () => {
  let component: ActualizarBody1Component;
  let fixture: ComponentFixture<ActualizarBody1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActualizarBody1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ActualizarBody1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
