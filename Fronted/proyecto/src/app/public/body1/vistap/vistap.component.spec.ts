import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VistapComponent } from './vistap.component';

describe('VistapComponent', () => {
  let component: VistapComponent;
  let fixture: ComponentFixture<VistapComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VistapComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VistapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
