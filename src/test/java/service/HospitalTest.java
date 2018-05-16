package service;

import org.junit.Assert;
import org.junit.Test;
import vo.Medicine;
import vo.Patient;
import vo.Prescription;

public class HospitalTest {

    @Test
    public void triadJohn() {
        final Patient john = new Patient().setName("Joao Alfredo")
                .setWeight(85)
                .setHeartBeat(110)
                .setMaxBeat(18L)
                .setMinBeat(11L);
        final Prescription triad = new Hospital().triad(john);
        Assert.assertNull(triad.getMedicine());
        Assert.assertEquals(0D, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triadMaria() {
        final Patient maria = new Patient()
                .setWeight(60)
                .setHeartBeat(121)
                .setMaxBeat(12L)
                .setMinBeat(8L);
        final Prescription triad = new Hospital().triad(maria);
        Assert.assertEquals(Medicine.CALMANT, triad.getMedicine());
        Assert.assertEquals(60D, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triadTadeu() {
        final Patient patient = new Patient()
                .setWeight(95)
                .setHeartBeat(199)
                .setMaxBeat(19L)
                .setMinBeat(7L);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertEquals(Medicine.CALMANT, triad.getMedicine());
        Assert.assertEquals(142.5D, triad.getDose(), 0);
        Assert.assertTrue(triad.isAlarm());
    }

    @Test
    public void triadLuiza() {
        final Patient patient = new Patient()
                .setWeight(55)
                .setHeartBeat(39)
                .setMaxBeat(8L)
                .setMinBeat(7L);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertEquals(Medicine.ADRENALINE, triad.getMedicine());
        Assert.assertEquals(27.5D, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triadJoana() {
        final Patient patient = new Patient()
                .setWeight(75)
                .setHeartBeat(19)
                .setMaxBeat(6L)
                .setMinBeat(2L);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertEquals(Medicine.ADRENALINE, triad.getMedicine());
        Assert.assertEquals(75D, triad.getDose(), 0);
        Assert.assertTrue(triad.isAlarm());
    }

    @Test
    public void triad150() {
        final Patient patient = new Patient()
                .setWeight(85)
                .setHeartBeat(150);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertEquals(Medicine.CALMANT, triad.getMedicine());
        Assert.assertEquals(1.0 * 85, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triad120() {
        final Patient patient = new Patient()
                .setWeight(85)
                .setHeartBeat(120);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertNull(triad.getMedicine());
        Assert.assertEquals(0, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triad40() {
        final Patient patient = new Patient()
                .setWeight(85)
                .setHeartBeat(40);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertNull(triad.getMedicine());
        Assert.assertEquals(0, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }

    @Test
    public void triad20() {
        final Patient patient = new Patient()
                .setWeight(85)
                .setHeartBeat(20);
        final Prescription triad = new Hospital().triad(patient);
        Assert.assertEquals(Medicine.ADRENALINE, triad.getMedicine());
        Assert.assertEquals(0.5 * 85, triad.getDose(), 0);
        Assert.assertFalse(triad.isAlarm());
    }
}